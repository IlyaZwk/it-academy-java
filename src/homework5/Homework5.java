package homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("task1");
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        int counter = 1;
        for (int i = 0; i < arrayLength; i++) {
            array[i] = counter;
            counter *= -1;
            if (counter > 0) {
                counter += 1;
            } else {
                counter -= 1;
            }

        }

        System.out.println(Arrays.toString(array));


        System.out.println("Enter array length: ");
        int arrayLength1 = sc.nextInt();
        int[] array1 = new int[arrayLength];
        int counter1 = 1;
        for (int j = 0; j < arrayLength1; j++) {
            array1[j] = counter1;

            if (j % 2 == 0) {
                counter1++;


            } else {
                array1[j] = 0;
            }


        }
        System.out.println(Arrays.toString(array1));
    }

    private static void task2() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("task2");
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = (r.nextInt(9) + 1);

            if (i % 2 == 0) {
                continue;

            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void task3() {
        Random r = new Random();
        int[] array = new int[4];
        System.out.println();
        System.out.println("task3");
        for (int i = 0; i < 4; i++) {
            array[i] = (r.nextInt(90) + 10);
        }

        System.out.println(Arrays.toString(array));
        if (array[3] > array[2] && array[2] > array[1] && array[1] > array[0]) {
            System.out.println("Это возрастающая последовательность");
        } else {
            System.out.println("Это не возрастающая последовательность");
        }

    }

    private static void task4() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("task4");
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];

        int arrOddLength = 0;
        int arrEvenLength = 0;
        int arrOddDigit = 0;
        int arrEvenDigit = 0;


        for (int i = 0; i < arrayLength; i++) {
            array[i] = (r.nextInt(90) + 10);
            if (array[i] % 2 == 0) {


                arrOddLength++;


            } else {


                arrEvenLength++;


            }


        }
        int[] arrayOddNumbers = new int[arrOddLength];
        int[] arrayEvenNumbers = new int[arrEvenLength];

        for (int number : array) {
            if (number % 2 == 0) {
                arrayOddNumbers[arrOddDigit] = number;
                arrOddDigit++;
            } else {
                arrayEvenNumbers[arrEvenDigit] = number;
                arrEvenDigit++;
            }
        }


        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayOddNumbers));
        System.out.println(Arrays.toString(arrayEvenNumbers));


    }

    private static void task5() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("task5");
        System.out.println("Enter array length: ");
        int arrayLength = sc.nextInt();
        int[] array = new int[arrayLength];
        int digit = 0;
        int i = 0;

        for (i = 0; i < arrayLength; i++) {
            array[i] = (r.nextInt(90) + 10);


        }
        System.out.println(Arrays.toString(array));

        System.out.println("Enter x: ");
        int x = sc.nextInt();
        for (int j = 0; j < arrayLength; j++) {

            digit = array[j];

            if (x == digit) {
                System.out.println("Данное число есть в массиве");
            }

        }

    }
}
