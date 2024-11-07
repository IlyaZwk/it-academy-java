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
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Circle 1");
        stack.push("Circle 2");
        stack.push("Circle 3");
        stack.push("Circle 4");

        System.out.println("Stack before pop: " + stack);

        String topCircle = stack.peek();
        System.out.println("Top Circle: " + topCircle);

        String poppedCircle1 = stack.pop();
        System.out.println("Popped Circle 1: " + poppedCircle1);

        String poppedCircle2 = stack.pop();
        System.out.println("Popped Circle 2: " + poppedCircle2);

        String poppedCircle3 = stack.pop();
        System.out.println("Popped Circle 3: " + poppedCircle3);

        String poppedCircle4 = stack.pop();
        System.out.println("Popped Circle 4: " + poppedCircle4);

        System.out.println("Stack after  pops: " + stack);
        boolean isEmpty= stack.isEmpty();
        if (stack.isEmpty()) {
            System.out.println("Empty Stack: " + stack);
        } else {
            System.out.println("Stack isnt empty!");
        }
    }

}
