package homework3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Task 1. Составные части 3х значного числа");
        task1();
        System.out.println("Task 2. Степень четности положительного 3х значного числа");
        task2();
        System.out.println("Task 3. Симметричность 3х значного числа");
        task3();
        System.out.println("Task 4. Проверка, могут ли числа быть сторонами треугольника");
        task4();
        System.out.println("Task 5. находим время года по порядковому номеру месяца");
        task5();
    }

    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int units = sc.nextInt();

        int unitsRemain = units % 10;

        int tens = (units % 100) - unitsRemain;

        int hundreds = units - (units % 100);

        System.out.println(hundreds + ("+" + tens) + "+" + unitsRemain);
    }

    private static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three digit number");
        int digit = sc.nextInt();
        int num1 = digit / 100;
        int num2 = (digit / 10) % 10;
        int num3 = digit % 10;
        int result = 0;
        if (isOdd(num1)) {
            result++;
        }
        if (isOdd(num2)) {
            result++;
        }
        if (isOdd(num3)) {
            result++;
        }
        System.out.println("Ответ: " + result);


    }

    private static void task3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a three digit number");
        int digit = sc.nextInt();

        int number1 = digit % 10;

        int number3 = digit / 100;

        if (number1 == number3) {
            System.out.println("число симметричное");
        } else {
            System.out.println("число не симметричное");
        }
    }

    private static boolean isOdd(int number) {
        return number % 2 == 0;
    }

    private static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1");
        int digit1 = sc.nextInt();
        System.out.println("Enter the number2");
        int digit2 = sc.nextInt();
        System.out.println("Enter the number3");
        int digit3 = sc.nextInt();
        if (digit1 + digit2 > digit3 && digit2 + digit3 > digit1 && digit1 + digit3 > digit2) {
            System.out.println("Эти числа могут быть треугольником");
        } else if (digit1 + digit2 <= digit3 && digit2 + digit3 <= digit1 && digit1 + digit3 <= digit2) {
            System.out.println("Эти числа не могут быть треугольником");
        }
    }

    private static void task5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Январь, Зима");
                break;
            case 2:
                System.out.println("Февраль, Зима");
                break;
            case 3:
                System.out.println("Март, Весна");
                break;
            case 4:
                System.out.println("Апрель, Весна");
                break;
            case 5:
                System.out.println("Май, Весна");
                break;
            case 6:
                System.out.println("Июнь, Лето");
                break;
            case 7:
                System.out.println("Июль, Лето");
                break;
            case 8:
                System.out.println("Август, Лето");
                break;
            case 9:
                System.out.println("Сентябрь, Осень");
                break;
            case 10:
                System.out.println("Октябрь, Осень");
                break;
            case 11:
                System.out.println("Ноябрь, Осень");
                break;
            case 12:
                System.out.println("Декабрь, Зима");
                break;

            default:
                System.out.println("Упс, такого месяца нет!");
        }
    }
}




