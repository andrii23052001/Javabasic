package practice;

public class AA {
    public static void main(String[] args) {
        int[] cube = new int[20];

        int min = 1; // Минимальное значение
        int max = 6; // Максимальное значение

        // Создаем массив для подсчета частоты появления каждой стороны (от 1 до 6)
        int[] frequency = new int[6];

        for (int i = 0; i < cube.length; i++) {
            cube[i] = (int)(Math.random() * (max - min + 1) + min); // Бросок кубика
            frequency[cube[i] - 1]++; // Увеличиваем счетчик для соответствующей стороны
        }

        // Выводим результаты
        for (int i = 0; i < frequency.length; i++) {
            int side = i + 1;
            int count = frequency[i];
            System.out.println("Сторона " + side + " выпала " + count + " раз");
        }
    }

}
