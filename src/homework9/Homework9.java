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
        System.out.println("Task2");

        Integer[] stack = {1,2,4,5,8};
        System.out.println("Stack : " + Arrays.toString(stack));

        int topElement= stack[0];
        System.out.println("Top element: " + topElement);

        ArrayIterator<Integer> stackIterator = new ArrayIterator<>(stack);
        for (int i = 0; i < stack.length; i++) {
            int nextElement = stackIterator.next();
                System.out.println("Popped element "+(i+1)+" : "+nextElement);
        }

        try {
            System.out.println(stackIterator.next());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is empty!");
        }
    }
}

