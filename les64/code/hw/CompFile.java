package hw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CompFile {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fil1 = new FileInputStream("./dest/img.png");
        FileInputStream fil2 = new FileInputStream("./dest/copy-img.png");

        if (args.length != 2) {
            System.out.println("Wrong number of arguments.");
            return;
        }

        int a = 0;
        try {
            a = fil1.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (a != -1) {
            System.out.println(a);
            try {
                a = fil1.read(); //
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("===================================================");
        int b = 0;
        try {
            b = fil2.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (b != -1) {
            System.out.println(b);
            try {
                b = fil2.read(); //
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (a == b) {
            System.out.println("Файлы совпадают");
        } else {
        System.out.println("Файлы не совпадают");
    }
    }
}
