import java.util.Arrays;
import java.util.SortedMap;

public class StringAppl {
    public static void main(String[] args) {

        System.out.println("---------------------");
        String str = "Hello";
        char [] chars = {32,'w','o','r','l','d'};// 32 - это код пробела
        String str1= new String(chars);
        System.out.println(str1);
        // собираем халло и ворлд
        str = str + str1;
        System.out.println(str);


        str = str.concat(str1); // аналогичная операция
        System.out.println(str);


        int l = str.length();// выясняем длинну строки
        System.out.println(" Length of string " + str + " : " + l);


        char c= str.charAt(str.length() - 1);       // charAt возвращает char
        System.out.println(" Last symbol of string : "+c);

        System.out.println("===============================");
        System.out.println("Печать по буквам");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        System.out.println();
        System.out.println("---------------------");
        String str2 = " World"; // будем его сравнивать с str 1 = " world"
        System.out.println(str1.equals(str2)); //ожидаем false
        System.out.println(str1.equalsIgnoreCase(str2));  // ожидаем true

        String str3 = str1.toUpperCase(); // переводим строку в upper case
        System.out.println(str3);
        System.out.println(str3.toLowerCase()); // переводим в низкий регистр

        System.out.println("=======================");
        System.out.println(str);
        // index - позиция символа в строке

        int index = str.indexOf('l'); // str = Hello
        System.out.println("Index of  l : "+l );

        index = str.indexOf("world");  // с какого индекса начинается строка "world"
        System.out.println(index);

        index = str.indexOf('l',4); // ищем l начиная с 4 го индекса в строке

        System.out.println(index);
       index = str.lastIndexOf('l');
        System.out.println(index);
        index= str.indexOf('A'); // ищем индекс отсуствуещей буквы
        System.out.println(index); // получаем - 1
        System.out.println("==================================");
        System.out.println(str.substring(4));// печатаем подстроку с индекса
        System.out.println(str.substring(1,8)); // печатаем подстроку с индекса до индекса
        System.out.println(str.replace("o","o-o-o"));
        System.out.println("================");
       String str4 = "        Bill        ";
        System.out.println(str4);
       str4 = str4.trim();   // обрезает пропуски
        System.out.println(str4);
        System.out.println("==============================");

        String str5 = "I love String in Java!";
        String[]words =str5.split(" "); // разделитель в строке пробел
        System.out.println("Quantity of words in string " + words.length);
        System.out.println(Arrays.toString(words));



        String str6="Я помню чудное мгновенье...";
        String[]letters = str6.split(""); //разделителя нет , что бы получить буквы
        System.out.println(Arrays.toString(letters));
    }


}
