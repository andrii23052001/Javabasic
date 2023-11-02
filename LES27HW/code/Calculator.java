import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double a = scanner.nextDouble();

        System.out.println("Введите оператор (+, -, *, /, %):");
        char operator = scanner.next().charAt(0);

        System.out.println("Введите второе число:");
        double b = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                break;
            case '%':
                if (b != 0) {
                    result = a % b;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                    return;
                }
                break;
            default:
                System.out.println("Неверный оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}

