package hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Задача 2. В массиве с ночной температурой за прошедшие 2 недели выяснить
        сколько раз ночью была минусовая температура.
        В какой из дней наблюдений случился первый заморозок?
        Когда был такой последний день? Какая максимальная температура
        была за период наблюдений? В какой день это было? Какая минимальная
        температура была за период наблюдений? В какой день это было?
        Какая средняя ночная температура была за период наблюдений?
        Были ли периоды, когда минус ночью держался несколько дней подряд?*/
public class WeatherAnalyzer {
    public static void main(String[] args) {
        List<Temperature> observations = new ArrayList<>();
        observations.add(new Temperature(LocalDate.now().minusDays(13), 5));
        observations.add(new Temperature(LocalDate.now().minusDays(12), -3));
        observations.add(new Temperature(LocalDate.now().minusDays(11), 2));
        observations.add(new Temperature(LocalDate.now().minusDays(10), -5));
        observations.add(new Temperature(LocalDate.now().minusDays(9), 4));
        observations.add(new Temperature(LocalDate.now().minusDays(8), -2));
        observations.add(new Temperature(LocalDate.now().minusDays(7), 1));
        observations.add(new Temperature(LocalDate.now().minusDays(6), -4));
        observations.add(new Temperature(LocalDate.now().minusDays(5), 3));
        observations.add(new Temperature(LocalDate.now().minusDays(4), -1));
        observations.add(new Temperature(LocalDate.now().minusDays(3), 0));
        observations.add(new Temperature(LocalDate.now().minusDays(2), 2));
        observations.add(new Temperature(LocalDate.now().minusDays(1), -6));
        observations.add(new Temperature(LocalDate.now(), 7));

        // Вопрос: Сколько раз ночью была минусовая температура за последние 2 недели?
        long countMinusDays = pcsMinusDaysFor2Weeks(observations);
        //Когда был такой последний день?
        getFirstFrozenDay(observations);
       /* Какая максимальная температура
        была за период наблюдений?*/
        getMaxTemperatureFor2Weeks(observations);
        getMinTemperatureFor2Weeks(observations);
        avgTemp(observations);
    }
    //  В массиве с ночной температурой за прошедшие 2 недели выяснить
    // сколько раз ночью была минусовая температура.
    private static long pcsMinusDaysFor2Weeks(List<Temperature> observations) {
        LocalDate twoWeeksAgo = LocalDate.now().minusWeeks(2);

        long count = observations.stream()
                .filter(temperature -> temperature.getDate().isAfter(twoWeeksAgo))
                .filter(temperature -> temperature.getNightTemperature() < 0)
                .count();

        System.out.println("Дней с минусовой температурой за последние 2 недели: " + count);
        return count;
    }

    //В какой из дней наблюдений случился первый заморозок?
    private static void getFirstFrozenDay(List<Temperature> observations) {
        LocalDate twoWeeksAgo = LocalDate.now().minusWeeks(2);
        Temperature firstFrozenDay = observations.stream()
                .filter(temperature -> temperature.getDate().isAfter(twoWeeksAgo))
                .filter(temperature -> temperature.getNightTemperature() < 0)
                .findFirst()
                .orElse(null);

        if (firstFrozenDay != null) {
            System.out.println("Первый заморозок произошел в день " + firstFrozenDay.getDate());
        } else {
            System.out.println("За последние 2 недели заморозков не было");
        }
    }

    //Какая максимальная температура
    //        была за период наблюдений?
    private static void getMaxTemperatureFor2Weeks(List<Temperature> observations) {
        LocalDate twoWeeksAgo = LocalDate.now().minusWeeks(2);
        Temperature maxTemperatureObservation = observations.stream()
                .filter(temperature -> temperature.getDate().isAfter(twoWeeksAgo))
                .max(Comparator.comparingInt(Temperature::getNightTemperature))
                .orElse(null);

        if (maxTemperatureObservation != null) {
            System.out.println("Максимальная температура за последние 2 недели была: " +
                    maxTemperatureObservation.getNightTemperature() + " градусов");
            System.out.println("Это произошло " + maxTemperatureObservation.getDate());
        } else {
            System.out.println("Нет данных о температуре за последние 2 недели");
        }
    }
  /*  Какая минимальная
    температура была за период наблюдений? В какой день это было?*/
  private static void getMinTemperatureFor2Weeks(List<Temperature> observations) {
      LocalDate twoWeeksAgo = LocalDate.now().minusWeeks(2);
      Temperature minTemperatureObservation=observations.stream()
              .filter(temperature -> temperature.getDate().isAfter(twoWeeksAgo))
              .min(Comparator.comparingInt(Temperature::getNightTemperature))
              .orElse(null);
      if (minTemperatureObservation != null) {
          System.out.println("Минимальная температура за последние 2 недели была: " +
                  minTemperatureObservation.getNightTemperature() + " градусов");
          System.out.println("Это произошло " + minTemperatureObservation.getDate());
      } else {
          System.out.println("Нет данных о температуре за последние 2 недели");
      }
      //Какая средняя ночная температура была за период наблюдений?
  }
    private static double avgTemp(List<Temperature> observations) {
        double averageTemperature = observations.stream()
                .mapToDouble(Temperature::getNightTemperature)
                .average()
                .orElse(Double.NaN);

        System.out.printf("Средняя температура: %.2f градусов%n", averageTemperature);

        return averageTemperature;
    }
    }