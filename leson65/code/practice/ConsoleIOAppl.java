package practice;

import java.io.*;

public class ConsoleIOAppl {
    public static void main(String[] args) throws IOException {
    //сценарий
    //спросим у пользователя имя файла , затем будем соханять то, что он напишет в этом файле
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter file name :");
    String str = br.readLine();//пользователь ввел правильное имя файла
     // System.out.println(str);

        PrintWriter pw = new PrintWriter(new FileWriter(str,true));//создаем поток в файл / с помощью append можем дополнять файлы
        System.out.println("Type text here,pls");
        str= br.readLine();
        while (!"stop".equalsIgnoreCase(str)){ //пока не стоп мы продолжаем
            pw.println(str);
            System.out.println("Type text here,pls");
            str= br.readLine();
        }
        pw.flush();//отправление из буфера в поток и потом в файл
        pw.close();
}
}