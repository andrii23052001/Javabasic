package practice;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {
    public static void main(String[] args) {
        System.out.println("Group list with gender(sex)");

        Map<String,String> groupMapGender=new HashMap<>();

        groupMapGender.put("Leonid", "Male");
        groupMapGender.put("Kirill", "Male");
        groupMapGender.put("Olesia", "Female");
        groupMapGender.put("Galina", "Female");
        groupMapGender.put("Andreas", "Male");
        groupMapGender.put("Sergei", "Male");
        groupMapGender.put("Elena", "Female");
        groupMapGender.put("Victor", "Male");
        groupMapGender.put("Tatyana", "Female");
        groupMapGender.put("Vladislava", "Female");
        groupMapGender.put("Iryna", "Female");
        groupMapGender.put("Sasha", "Male");
        int women=0;
        for (String name:groupMapGender.keySet()){//ПРОХОД ПО КЛЮЧАМ
            if (groupMapGender.get(name).equals("Female")){
                women++;
            }
        }
        women=0;
        for (String name:groupMapGender.values()){//по колекции значений
            if (name.equals("Male")){ //содержит значание
                women++;
            }
        }
        System.out.println("Women :"+women);
    }
}
