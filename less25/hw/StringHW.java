
/*Задача 1. Дана строка "I'm proud to learn Java! Java is the most famous programming language!!!"
 Выполнить практикум с этой строкой:

        Распечатать последний символ строки.
        Найти позицию подстроки “Java” в строке.
        Проверить, содержит ли заданная строка подстроку “Java”.
        Заменить все символы “o” на “a”.
        Преобразуйте строку к верхнему регистру.
        Преобразуйте строку к нижнему регистру.
        Вырезать подстроку Java c помощью метода substring().
        Проверить, заканчивается ли строка подстрокой “!!!”.
        Проверить, начинается ли строка подстрокой “I'm proud”.

              */

public class StringHW {
    public static void main(String[] args) {


        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        char lastsymbol = str.charAt(str.length() - 1);    // поиск последнего элемента
        System.out.println("Last symbol : " + lastsymbol);

        split();

        int index = str.indexOf("Java");                    // поиска индекса где начинается Java в строке
        System.out.println("Java position :" + index);

        split();

        String substringToFind = "Java";
        if (str.contains(substringToFind)) {                 // поиска слова Java в строке да или нет
            System.out.println("Строка содержит подстроку 'Java'.");
        } else {
            System.out.println("Строка не содержит подстроку 'Java'.");
        }
        System.out.println(str.contains(substringToFind));  // или так короче true или false

        split();

        System.out.println(str.replace("o", "a")); // замена всех букв o на a в строке

        split();

        String strUpperCase= str.toUpperCase();
        System.out.println(strUpperCase);           // это мы переводим строку в регистр с (высший)большими буквами
        System.out.println(str.toUpperCase());      // можно вызвать просто саутом

        split();

        String strLowerCase =str.toLowerCase();  //это мы переводим в низкий регистр
        System.out.println(strLowerCase);
        System.out.println(str.toLowerCase());  // можно вызвать просто саутом

        split();


     //   "I'm proud to learn Java! Java is the most famous programming language!!!"
          // нужно вырезать слово Java из строки
        System.out.print(str.substring(0,19));
        System.out.print(str.substring(23,25));
        System.out.print(str.substring(30));    // я считаю// что это гений , этот парень гений
                                                     // вырезали слово Java из строки с помощью возможности начинать строку с определенных индексов
                                                        // уверен что есть метод куда проще

        System.out.println();
        split();

        String str1 = "I'm proud to learn Java! Java is the most famous programming language!!!";
        String substringToCheck = "!!!";

        System.out.println(str1.endsWith(substringToCheck));  //проверка гения заканчивается ли строка подстрокой (!!!)

        split();

        String substringToCheckfirstwords="I'm proud";
        System.out.println(str1.startsWith(substringToCheckfirstwords)); // проверка что бы проверить начало строки на определенную под строку



    }
    public static void split () {
        System.out.println("------------------------------------------------------");
    }
}
