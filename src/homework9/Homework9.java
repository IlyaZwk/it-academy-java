package homework9;

import java.util.*;

public class Homework9 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Task1:");
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 3, 1, 4, 5, 2);
        List<Integer> duplicateIntegerList = new ArrayList<>();
        for (int i = 0; i < integerList.size(); i++) {
            int freq = Collections.frequency(integerList, i);
            if (freq > 1) {
                duplicateIntegerList.add(i);
            }
        }
        System.out.println(duplicateIntegerList);
    }

    public static void task2() {
        // pop push to integer
        System.out.println("Task2");
        Integer[] intStack = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        ArrayStack stack = new ArrayStack(intStack);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(4);
        stack.push(12);
        List<Integer> temp1 = new ArrayList<>();
        for (int i = 0; i < intStack.length; i++) {
            if (intStack[i] > 0) {
                temp1.add(intStack[i]);
            }
        }
        System.out.println("Stack: " + temp1);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        List<Integer> temp2 = new ArrayList<>();
        for (int i = 0; i < intStack.length; i++) {
            if (intStack[i] > 0) {
                temp2.add(intStack[i]);
            }
        }
        System.out.println("Stack after pops: " + temp2);
    }
}


