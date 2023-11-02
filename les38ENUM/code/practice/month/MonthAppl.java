package practice.month;

public class MonthAppl {
    public static void main(String[] args) {
     Month month = Month.FEB;
        System.out.println(month);
        System.out.println(month.plusMounth(2));//к февралю добавили два месяца ждем APR
        System.out.println(month.plusMounth(13)); // получаем март



    }
}
