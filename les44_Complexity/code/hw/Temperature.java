package hw;

/*Задача 1. Имеются результаты измерений температуры в городе за последнюю неделю октября
        и первую неделю ноября. Данные представлены в виде двух массивов.
        Рассчитайте среднюю температуру в городе за прошедшие две недели.*/
public class Temperature {
    public static void main(String[] args) {

        int[]lastWeekOfOktober={10,7,11,12,8,6,15};
        int sum =0;
        for (int i = 0; i < lastWeekOfOktober.length; i++) {
             sum+=lastWeekOfOktober[i];
        }
        double avg = (double) sum / lastWeekOfOktober.length;
        System.out.println("Average temperature last week of October " + avg);

        int[]firstWeekOfNobember={7,5,7,3,5,10,12};
        int sum1 =0 ;
        for (int i = 0; i < firstWeekOfNobember.length; i++) {
            sum1+=firstWeekOfNobember[i];
        }
        double avg1= (double) sum1 / firstWeekOfNobember.length;
        System.out.println("Average temperature first week of November: "+avg1);

        double avgTempforTwoLastWeeks= (avg + avg1) /2;
        System.out.println("Last two weeks temperature "+ avgTempforTwoLastWeeks);

    }

}
