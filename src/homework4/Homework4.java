package homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Задание 1. Введите 3 числа, после введите 1 если закончить цикл, другое число если продолжить");
        task1();
        System.out.println("Задание 2. Фибоначи");
        task2();
        System.out.println("Задание 3. Проверка числа на + -");
        task3();
//        System.out.println("Задание 4. Билетики");
//        task4(); not work
        System.out.println("Задание 5. Таблица умножения");
        task5();
    }

    private static void task1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int num1 = sc.nextInt();
        System.out.println("Введите 2 число");
        int num2 = sc.nextInt();
        System.out.println("Введите 3 число");
        int num3 = sc.nextInt();
        System.out.println(num1 * num2 * num3);
        System.out.println("Введите 1, если хотите закончить цикл, другое любое число если хотите продолжить");
        int num4 = sc.nextInt();
        if (num4 == 1) {
            System.out.println("Цикл завершён.");

        } else {
            System.out.println("Введите 1 число");
            int digit1 = sc.nextInt();
            System.out.println("Введите 2 число");
            int digit2 = sc.nextInt();
            System.out.println(digit1 * digit2);
        }
    }

    private static void task2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите 2 число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите число N: ");
        int n = sc.nextInt();
        System.out.print(num1+" "+num2+" ");
        for(int i = 3; i <= n; i++){
            int num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }
        System.out.println();

    }



    private static void task3() {
            Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int num1 = sc.nextInt();
        if (num1 == 0) {
            System.out.println("Цикл завершён.");

        } else if(num1 > 0) {
            System.out.println("Плюс");
        }
        else{
            System.out.println("Минус");

        }
    }
    // not work
//    private static void task4() {
//        for (int i = 1;i<=999999;i++){
//        int num6 = i % 10;
//        int num5 = (i % 100) / 10;
//        int num4 = (i % 1000) / 100;
//        int num3 = (i % 10000) / 1000;
//        int num2 = (i % 100000) / 10000;
//        int num1 = (i % 1000000) / 100000;
//        int result = 0;
//        int sum123 = num1+num2+num3;
//        int sum456 = num4+num5+num6;
//        if (sum123==sum456);{
//        result++;
//        }
//
//        }
//
//
//
//
//
//    }
    private static void task5() {
        int a = 1;
        do{
            System.out.print(a+"\t");
            a++; }
        while (a < 10);
        System.out.println("\t");
        int b = 2;
        do{
            System.out.print(b+"\t");
            b = b+2; }
        while (b < 19);
        System.out.println("\t");
        int c = 3;
        do{
            System.out.print(c+"\t");
            c=c+3; }
        while (c < 28);
        System.out.println("\t");
        int d = 4;
        do{
            System.out.print(d+"\t");
            d=d+4; }
        while (d < 37);
        System.out.println("\t");
        int f = 5;
        do{
            System.out.print(f+"\t");
            f=f+5; }
        while (f < 46);
        System.out.println("\t");
        int t = 6;
        do{
            System.out.print(t+"\t");
            t=t+6; }
        while (t < 55);
        System.out.println("\t");
        int g = 7;
        do{
            System.out.print(g+"\t");
            g=g+7; }
        while (g < 64);
        System.out.println("\t");
        int s = 8;
        do{
            System.out.print(s+"\t");
            s=s+8; }
        while (s < 73);
        System.out.println("\t");
        int y = 9;
        do{
            System.out.print(y+"\t");
            y=y+9; }
        while (y < 82);
        System.out.println("\t");





    };

}



