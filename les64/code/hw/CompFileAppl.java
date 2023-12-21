package hw;

import java.io.FileInputStream;
import java.io.IOException;

/*Задание 1. В классе CompareFileAppl реализовать логику сравнения двух файлов
        в методе main. Имена файлов принимать через массив args.
        Два файла считаем одинаковыми, если у них одинаковая длина,
        и на тех же позициях стоят те же байты.
        Результат должен быть выведен на консоль в виде сообщения.*/
public class CompFileAppl {
    public static void main(String[] args) {
        if (args.length!=2){
            System.out.println("Wrong number of arguments.");
        }
        // Получение имен файлов из аргументов командной строки
        String file1Path = args[0];
        String file2Path = args[1];

        // Вызов метода для сравнения файлов
        try {
            boolean areFilesEqual = compareFiles(file1Path, file2Path);

            if (areFilesEqual) {
                System.out.println("Files are equal.");
            } else {
                System.out.println("Files are not equal.");
            }
        } catch (IOException e) {
            System.err.println("Error reading files: " + e.getMessage());
        }
    }

    private static boolean compareFiles(String file1Path, String file2Path) throws IOException {
        try (FileInputStream fis1 = new FileInputStream(file1Path);
             FileInputStream fis2 = new FileInputStream(file2Path)) {

            int byte1, byte2;
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    return false;
                }
            }

            // Проверка, достигли ли оба файла конца одновременно
            return fis1.read() == -1 && fis2.read() == -1;
        }
    }
}



