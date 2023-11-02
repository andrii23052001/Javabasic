package homeword;

//Задача 1. Распечатайте все числа меньшие 200 и кратные 13.
public class HWChisla {
    public static void main(String[] args) {
        int num=1;
        // начинаем с числа 1
     while (num<=200){
         if (num%13==0){

             System.out.println(" Число : " + num);
         }
         num++;
     }

    }
}
