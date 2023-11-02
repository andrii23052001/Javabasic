package practice;

public class StringBuilderAppl {
    public static void main(String[] args) {
        //StringBuilder - это класс в нем есть полезные методы для работы со строками
      //append добавление
        String str = "Java";
        // str= str "_" + 11
        str=str.concat("_");// concat это склеивание
        str=str.concat(""+11); // к строке добавляем число 11 примитив который являеться INT
        System.out.println(str);

        //StringBuilder - mutable
        StringBuilder sb = new StringBuilder("Java");
        sb.append("_").append(11);
        System.out.println(sb); // обьект sb - мутирует
        sb.reverse(); // строка задом наперед
        System.out.println(sb);
        //можно ли вернуть тип StringBuilder обратно в String?
        str= sb.toString();
        System.out.println(str); // перевели в строку
    }
}
