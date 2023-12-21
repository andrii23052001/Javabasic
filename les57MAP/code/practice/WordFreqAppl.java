package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordFreqAppl {
    public static void main(String[] args) {
        String[] words = {"abc", "ab", "limit", "ab", "a", "ab", "limit"};
        printWordsFrequency(words);


    }

    private static void printWordsFrequency(String[] words) {
        Map<String, Integer> resMap = new HashMap<>();
        for (String word :
                words) {
            if (!resMap.containsKey(word)) {//такое слово еще не встречалось
                resMap.put(word, 1);//пишем мапу и 1
            } else {
                resMap.put(word, resMap.get(word) + 1);
            }
        }
        Set<Map.Entry<String,Integer>> entries = resMap.entrySet();
        System.out.println("===========UNSORTED================");
        for (Map.Entry<String,Integer>()entry :
             entries) {

        }
    }

}
