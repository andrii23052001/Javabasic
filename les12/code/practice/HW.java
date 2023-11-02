package practice;

//Задача 2. Бросьте кубик с 6-ю гранями 20 раз.
  //      Подсчитайте, сколько раз выпала каждая цифра.
public class HW {

    public static void main(String[] args) {
        int[] cube = new int[20];

        int min = 1; // Минимальное значение
        int max = 6; // Максимальное значение

        // Создаем массив для подсчета частоты появления каждой стороны (от 1 до 6)
        int[] calculate = new int[6];

        for (int i = 0; i < cube.length; i++) {
            cube[i] = (int) (Math.random() * (max - min + 1) + min);
            calculate[cube[i] - 1]++;
        }
            for (int i = 0; i < calculate.length; i++) {
                int side = i + 1;
                int count = calculate[i];
                System.out.println("Сторона " + side + " выпала " + count + " раз");
            }
        }
    }



