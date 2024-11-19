package homework9;

import java.util.Arrays;

public class ArrayStack {

    private Integer[] array;
    private int index;
    private int size;


    public ArrayStack(Integer[] array) {
        this.array = array;
    }

    public void push(int s) {
        array[index++] = s;
    }

    public int pop() {
        try {
            array[--index] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is empty!");
        }
        return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}