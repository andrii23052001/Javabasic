package hw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Задача 2. В массиве с ночной температурой за прошедшие 2 недели выяснить
        сколько раз ночью была минусовая температура.
        В какой из дней наблюдений случился первый заморозок?
        Когда был такой последний день? Какая максимальная температура
        была за период наблюдений? В какой день это было? Какая минимальная
        температура была за период наблюдений? В какой день это было?
        Какая средняя ночная температура была за период наблюдений?
        Были ли периоды, когда минус ночью держался несколько дней подряд?*/
public class WeatherAnalyzer1 {
    public static void main(String[] args) {
        List<Temperature1> observations = new ArrayList<>();
        observations.add(new Temperature1(LocalDate.now().minusDays(13), 5));
        observations.add(new Temperature1(LocalDate.now().minusDays(12), -3));
        observations.add(new Temperature1(LocalDate.now().minusDays(11), 2));
        observations.add(new Temperature1(LocalDate.now().minusDays(10), -5));
        observations.add(new Temperature1(LocalDate.now().minusDays(9), 4));
        observations.add(new Temperature1(LocalDate.now().minusDays(8), -2));
        observations.add(new Temperature1(LocalDate.now().minusDays(7), 1));
        observations.add(new Temperature1(LocalDate.now().minusDays(6), -4));
        observations.add(new Temperature1(LocalDate.now().minusDays(5), 3));
        observations.add(new Temperature1(LocalDate.now().minusDays(4), -1));
        observations.add(new Temperature1(LocalDate.now().minusDays(3), 0));
        observations.add(new Temperature1(LocalDate.now().minusDays(2), 2));
        observations.add(new Temperature1(LocalDate.now().minusDays(1), -6));
        observations.add(new Temperature1(LocalDate.now(), 7));
        pcsMinusDaysForLast2weeks(observations);
        getFirstFrozenDay(observations);
        getLastFrozenDay(observations);
        getMaxTemperatureFor2Weeks(observations);
        getMinTemperatureFor2Weeks(observations);
        avgTempForLast2weeks(observations);
        hasConsecutiveNegativeNights(observations);


    }

    /*  В массиве с ночной температурой за прошедшие 2 недели выяснить
      сколько раз ночью была минусовая температура.*/
    private static long pcsMinusDaysForLast2weeks(List<Temperature1> observations) {
        long count = observations.stream().filter(temperature1 -> temperature1.getNightTemperature() < 0)
                .count();
        System.out.println("Дней с минусовой температурой за последние 2 недели: " + count);
        return count;
    }

  /*  В какой из дней наблюдений случился первый заморозок?*/
    private static void getFirstFrozenDay(List<Temperature1> observations) {
        Temperature1 firstFrozenDay =
                observations.stream().filter(temperature1 -> temperature1.getNightTemperature() < 0)
                        .findFirst()
                        .orElse(null);

        if (firstFrozenDay != null) {
            System.out.println("Первый заморозок произошел в день " + firstFrozenDay.getDate());
        } else {
            System.out.println("За последний период заморозков не было");
        }
    }
    private static void getLastFrozenDay(List<Temperature1> observations){
        Collections.reverse(observations);
        Temperature1 firstFrozenDay =
                observations.stream().filter(temperature1 -> temperature1.getNightTemperature() < 0)
                        .findFirst()
                        .orElse(null);
        if (firstFrozenDay != null) {
            System.out.println("Последний заморозок произошел в день " + firstFrozenDay.getDate());
        } else {
            System.out.println("За последний период заморозков не было");
        }
    }
   /* Какая максимальная температура
    была за период наблюдений?*/
  /* В какой день это было?*/
    private static void getMaxTemperatureFor2Weeks(List<Temperature1> observations) {
        //сортировка начинается от меньшего к большему поэтому юзаем .reversed()
        List<Temperature1> res =observations.stream().sorted(Comparator.comparingInt(Temperature1::getNightTemperature).reversed())
                .collect(Collectors.toList());

        for (Temperature1 temperature : res) {
            System.out.println("Максимальная температура за последние 2 недели: "
                    + temperature.getNightTemperature()  + " градусов, дата: " + temperature.getDate());
            break; // Выход из цикла после вывода первого элемента
        }
    }
    /* Какая минимальная
    температура была за период наблюдений?*/
   private static void getMinTemperatureFor2Weeks(List<Temperature1> observations) {
       List<Temperature1>res=observations.stream().sorted(Comparator.comparingInt(Temperature1::getNightTemperature))
               .collect(Collectors.toList());
       for (Temperature1 temperature:
            res) {
           System.out.println("Минимальная температура за последние 2 недели: "+temperature.getNightTemperature()
           +" градусов, дата: " + temperature.getDate());
           break;
       }
}
    private static double avgTempForLast2weeks(List<Temperature1> observations) {
        double averageTemperature = observations.stream()
                .mapToDouble(Temperature1::getNightTemperature)
                .average()
                .orElse(Double.NaN);

        if (!Double.isNaN(averageTemperature)) {
            System.out.printf("Средняя температура за последние две недели: %.2f градусов%n", averageTemperature);
        } else {
            System.out.println("Нет данных о температуре за последние две недели");
        }

        return averageTemperature;
    }
    private static boolean hasConsecutiveNegativeNights(List<Temperature1> observations) {
        int consecutiveNegativeCount = 0;

        for (Temperature1 temperature : observations) {
            if (temperature.getNightTemperature() < 0) {
                consecutiveNegativeCount++;
            } else {
                consecutiveNegativeCount = 0; // Обнуляем счетчик при положительной температуре
            }

            // Если минусовая температура держится более чем 1 день, вернем true и выведем сообщение
            if (consecutiveNegativeCount > 1) {
                System.out.println("Были периоды, когда минус ночью держался несколько дней подряд");
                return true;
            }
        }

        System.out.println("Минусовая температура ночью не держалась несколько дней подряд");
        return false;
    }
    }