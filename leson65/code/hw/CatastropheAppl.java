package hw;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*Считать файл tarin.csv, сделать расчеты:

        Задание 1. Подсчитайте общую стоимость проезда (выручка от рейса).

        Задание 2. Посчитайте средний тариф для 1,2,3 классов путешествия.

        Задание 3. Подсчитайте общее количество выживших и погибших пассажиров.


        Задание 4. Подсчитайте общее количество выживших и погибших мужчин, женщин и детей (до 18 лет).*/

public class CatastropheAppl {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("leson65/code/hw/train.csv"));
            String str = br.readLine();

            double revenues = 0; // выручка
            int class1pcs = 0;
            int class2pcs = 0;
            int class3pcs = 0;
            double totalFareForClass1 = 0;
            double totalFareForClass2 = 0;
            double totalFareForClass3 = 0;
            int тоталвыжившихлюдей = 0;
            int тоталпогибшихлюдей = 0;
            int тоталвыжившихмужчин = 0;
            int тоталпогибшихмужчин = 0;
            int тоталвыжившихженщин = 0;
            int тоталпогибшихженщин = 0;
            int тоталвыжившихдетей = 0;
            int тоталпогибшихдетей = 0;


            /*Этот код считывает строки из BufferedReader (br) до тех пор,
            пока не достигнет конца файла (null).
                    Каждая считанная строка сохраняется в переменной str.*/
            while ((str = br.readLine()) != null) {
                String[] cells = str.split(",");
                revenues += Double.parseDouble(cells[10]);

                if ("1".equals(cells[1].trim()) && !cells[6].trim().isEmpty() && Double.parseDouble(cells[6].trim()) < 18) {
                    тоталвыжившихдетей++; // парсим в дабл, так как возраст предоставлен не целыми числами
                }
                if ("0".equals(cells[1].trim()) && !cells[6].trim().isEmpty() && Double.parseDouble(cells[6].trim()) < 18) {
                    тоталпогибшихдетей++;
                }
                if ("1".equals(cells[1].trim()) && "female".equals(cells[5].trim())) {
                    тоталвыжившихженщин++;
                }
                if ("1".equals(cells[1].trim()) && "male".equals(cells[5].trim())) {
                    тоталвыжившихмужчин++;
                }
                if ("0".equals(cells[1].trim()) && "male".equals(cells[5].trim())) {
                    тоталпогибшихмужчин++;
                }
                if ("0".equals(cells[1].trim()) && "female".equals(cells[5].trim())) {
                    тоталпогибшихженщин++;
                }

                if ("1".equals(cells[1].trim())) {
                    тоталвыжившихлюдей++;
                }
                if ("0".equals(cells[1].trim())) {
                    тоталпогибшихлюдей++;
                }

                // Проверяем, является ли класс равным 1
                if ("1".equals(cells[2].trim())) {
                    class1pcs++;
                    double fare = Double.parseDouble(cells[10]);
                    totalFareForClass1 += fare;
                }
                if ("2".equals(cells[2].trim())) {
                    class2pcs++;
                    double fare = Double.parseDouble(cells[10]);
                    totalFareForClass2 += fare;
                }
                if ("3".equals(cells[2].trim())) {
                    class3pcs++;
                    double fare = Double.parseDouble(cells[10]);
                    totalFareForClass3 += fare;
                }
            }

            System.out.println("===============================================");
            System.out.printf("Общая выручка: %.2f%n", revenues);
            System.out.println("-----------------------------------------------");
            System.out.println("Количество пассажиров в 1 классе: " + class1pcs);
            System.out.println("Количество пассажиров в 2 классе: " + class2pcs);
            System.out.println("Количество пассажиров в 3 классе: " + class3pcs);
            System.out.println("-----------------------------------------------");
            System.out.printf("Общая цена первого класса: %.2f%n", totalFareForClass1);
            System.out.printf("Общая цена второго класса: %.2f%n", totalFareForClass2);
            System.out.printf("Общая цена третьего класса: %.2f%n", totalFareForClass3);
            System.out.println("-----------------------------------------------");
            System.out.printf("Cредний тариф для первого класса: %.2f%n", totalFareForClass1 / class1pcs);
            System.out.printf("Cредний тариф для второго класса: %.2f%n", totalFareForClass2 / class2pcs);
            System.out.printf("Cредний тариф для третьего класса: %.2f%n", totalFareForClass3 / class3pcs);
            System.out.println("-----------------------------------------------");
            System.out.println(" Кол-во выживших людей " + тоталвыжившихлюдей);
            System.out.println(" Кол-во погибших людей " + тоталпогибшихлюдей);
            System.out.println("-----------------------------------------------");
            System.out.println(" Кол-во выживших мужчин " + тоталвыжившихмужчин);
            System.out.println(" Кол-во погибших мужчин " + тоталпогибшихмужчин);
            System.out.println("-----------------------------------------------");
            System.out.println(" Кол-во выживших женщин " + тоталвыжившихженщин);
            System.out.println(" Кол-во погибших женщин " + тоталпогибшихженщин);
            System.out.println("-----------------------------------------------");
            System.out.println(" Кол-во выживших детей " + тоталвыжившихдетей);
            System.out.println(" Кол-во погибших детей " + тоталпогибшихдетей);
            System.out.println("===============================================");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
/*
    BufferedReader в Java используется для эффективного
    построчного чтения текстовых данных из входного потока с буферизацией.*/
/*
Буферизация — это механизм временного хранения данных в
        буфере (временной области памяти) перед их обработкой
        или записью в другое место. В программировании, буферизация
        обычно используется для оптимизации ввода/вывода, уменьшения количества
        обращений к физическому устройству и улучшения производительности.*/

/*
"0".equals(cells[1].trim()): Это условие проверяет, что значение
        в ячейке cells[1] равно строке "0". trim() используется
        для удаления возможных пробелов в начале и конце строки.

        !cells[6].trim().isEmpty(): Это условие проверяет, что
        значение в ячейке cells[6] не является пустой строкой.
        trim() также используется для удаления пробелов в начале
        и конце строки.

        Double.parseDouble(cells[6].trim()) < 18:
        Это условие проверяет, что числовое значение,
        полученное из строки cells[6] (после удаления пробелов
        и преобразования в double), меньше 18.*/
