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
    }
    public static void task2() {
        Map<String, List<Integer>> userMap = new HashMap<>();
        List<Integer> petrovNums = new ArrayList<>();
        petrovNums.add(1111);
        petrovNums.add(1222);
        petrovNums.add(1333);
        List<Integer> sidorovNums = new ArrayList<>();
        sidorovNums.add(2111);
        sidorovNums.add(2222);
        sidorovNums.add(2333);
        List<Integer> ivanovNums = new ArrayList<>();
        ivanovNums.add(3111);
        ivanovNums.add(3222);
        ivanovNums.add(3333);
        userMap.put("Petrov", petrovNums);
        userMap.put("Sidorov", sidorovNums);
        userMap.put("Ivanov", ivanovNums);
        printNum(userMap);
    }

    public static void printNum(Map<String, List<Integer>> userMap) {
        for (var item : userMap.entrySet()) {
            String nums = "";
            System.out.println();
            for (int i : item.getValue()) {
                nums = nums + i + " ";
            }
            System.out.printf("%s: %s", item.getKey(), nums);
        }
    }
}
