package hw;

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFileAppl {
    public static void main(String[] args) {
        // Проверка наличия двух аргументов (имен файлов) в командной строке
        if (args.length != 2) {
            System.out.println("Usage: CompareFileAppl <file1> <file2>");
            return;
        }

        // Получение имен файлов из аргументов командной строки
        String file1Path = args[0];
        String file2Path = args[1];

        try {
            // Вызов метода для сравнения файлов
            if (areFilesEqual(file1Path, file2Path)) {
                System.out.println("Files are identical.");
            } else {
                System.out.println("Files are different.");
            }
        } catch (IOException e) {
            // Обработка исключения ввода/вывода
            System.out.println("An error occurred while comparing files: " + e.getMessage());
        }
    }

    // Метод для сравнения двух файлов по байтам
    private static boolean areFilesEqual(String file1Path, String file2Path) throws IOException {
        // Используем try-with-resources для автоматического закрытия потоков
        try (FileInputStream fis1 = new FileInputStream(file1Path);
             FileInputStream fis2 = new FileInputStream(file2Path)) {

            int byte1, byte2;

            // Считываем байты из обоих файлов и сравниваем их
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    return false; // файлы различаются
                }
            }

            // Проверяем, что оба файла закончились одновременно
            return fis1.read() == -1 && fis2.read() == -1;
        }
    }
}
