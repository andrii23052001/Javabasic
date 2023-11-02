package practice;

import java.util.Scanner;

//Задача 3. В сберкассу на трёхпроцентный вклад положили s рублей.
// Какой станет сумма вклада через n лет.
// Использовать цикл for.
public class Bank {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите начальную сумму вклада (рубли): ");
            double P = scanner.nextDouble();
            double r = 0.03;  // Годовая процентная ставка (3%)

            System.out.print("Введите количество лет: ");
            int n = scanner.nextInt();

            for (int year = 1; year <= n; year++) {
                P = P * (1 + r);
            }

            System.out.printf("Через %d лет сумма вклада будет составлять %.2f рублей.%n", n, P);
        }
    }


