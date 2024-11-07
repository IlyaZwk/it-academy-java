package homework8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework8 {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Task1:");
        Map<Integer, String> mapSwap = new HashMap<>();

        mapSwap.put(1, "A");
        mapSwap.put(2, "B");
        mapSwap.put(3, "C");
        System.out.println("Main map:" + mapSwap.entrySet());

        HashMap<String, Integer> newSwapMap = new HashMap<>();

        for (Map.Entry<Integer, String> swap : mapSwap.entrySet()) {
            newSwapMap.put(swap.getValue(), swap.getKey());
        }
        System.out.println("Result of mapSwap: " + newSwapMap);
        System.out.println();
    }
    public static void task2() {
        System.out.println("Task2:");
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        Phonebook.addNum("Petrov",1111,phoneBook);
        Phonebook.addNum("Petrov",1222,phoneBook);
        Phonebook.addNum("Petrov",1333,phoneBook);
        Phonebook.addNum("Ivanov",2111,phoneBook);
        Phonebook.addNum("Ivanov",2222,phoneBook);
        Phonebook.addNum("Ivanov",2333,phoneBook);
        Phonebook.addNum("Sidorov",3111,phoneBook);
        Phonebook.addNum("Sidorov",3222,phoneBook);
        Phonebook.addNum("Sidorov",3333,phoneBook);
        Phonebook.printBook(phoneBook);
    }


}
