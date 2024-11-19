package homework9;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayStack<T> implements Iterator<T> {

    private T[] array;
    private T array1;
    private int index;
    private int size;


    public ArrayStack(T[] array) {
        this.array = array;

    }

    public void push(T s) {
        array[index++]=s;
    }
    public int pop() {
        Integer array1=0;

        try {
            array[--index]= (T) array1;
            return 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is empty!");
        }
        return 0;
    }
    public int popStr() {
        String array1=" ";
        try {
            array[--index]= (T) array1;
            return 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stack is empty!");
        }
        return 0;
    }

    @Override
    public boolean hasNext() {
        return index < array.length;
    }

    @Override
    public T next() {
        return array[index++];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}