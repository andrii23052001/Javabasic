package practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapIntroAppl {
    public static void main(String[] args) {
        //Создадим мапу, отражающую кол-во людей(население) в городах США
        Map<String,Integer> usaCities=new TreeMap<>();//создали обьект типа Map
        usaCities.put("Denver",600_000);
        usaCities.put("Boston",670_000);
        usaCities.put("Chicago",2_700_000);
        usaCities.put("Atlanta",470_000);
        usaCities.put("New York",8_500_000);
        usaCities.put("Dallas",1_300_000);
        System.out.println("Map size:"+usaCities.size());
        System.out.println("Is empty:"+usaCities.isEmpty());
        //получения значения по ключу
        Integer num = usaCities.get("Chicago");
        System.out.println("Population of Chicago:"+num);
        int pop = usaCities.get("Atlanta");
        System.out.println("Population of Atlanta"+pop);


        //проверка ключа на наличие
        System.out.println(usaCities.containsKey("Boston"));//ожидаем тру
        System.out.println(usaCities.containsKey("Detroit"));//ожидаем фолс

        //обновим значение в мапе по ключу
        num=usaCities.put("Chicago",2_700_001);//изменили значение
        System.out.println(num);//это старое значение переменной
        System.out.println("Update population of Chicago:"+usaCities.get("Chicago"));//вытаскиваем значение
        num=usaCities.put("Chicago",2_700_002);
        System.out.println(num);

        Collection<Integer>population=usaCities.values();//вытащили значения в коллекцию
        int total=0;
        for (Integer integer:
             population) {
            total+=integer;
        }
        System.out.println("Population:"+total);

        //распечатаем содержимое мапы
        System.out.println("=============Print Map===============");
        Set<String>keys = usaCities.keySet();
        for (String key : keys) {
            System.out.println(key +"->"+usaCities.get(key));
        }
        //еще другой вариант
        System.out.println("----------------------------------------------------");
        Set<Map.Entry<String,Integer>>entries= usaCities.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+ "=>"+entry.getValue());
        }
        System.out.println("-----------------------------------------------------");
        System.out.println(entries);
    }
}
