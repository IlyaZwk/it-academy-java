package homework8;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<Integer>> phoneBook = new HashMap<>();

    public static void addNum(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> contact = new ArrayList<>();
            contact.add(value);
            map.put(key,contact);
        }
    }
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String nums = " ";
            for(int i: item.getValue()){
                nums = nums + i + " ";
            }
            System.out.printf("%s: %s \n", item.getKey(), nums);
        }
    }

}


