package homework7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

    }

    private static void task1() {
        System.out.println("task1:");
        String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry";

        for (int b = 0; b <= str.length()-1; b++) {
            if (b == str.length()-1) {

                Pattern pattern = Pattern.compile(String.valueOf(str.charAt(b)));
                Matcher matcher = pattern.matcher(str);
                String startEndTemplate = "%s  %d %n";
                while (matcher.find()) {
                    System.out.println(matcher.group());
                    System.out.format(startEndTemplate, "position of the same symbol:", matcher.start());

                }
            }

        }


    }

    private static void task2() {
        System.out.println("task2");
        System.out.println("Enter the text:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean palindrom = false;
        for (int a=0; a<=str.length()-1; a++){
            for (int b=str.length()-1; b>=0; b--)
            {
                if (str.charAt(a) == str.charAt(b)){
                    palindrom = true;
                }

                else {
                    palindrom = false;
                }

            }
        }

        System.out.println(palindrom);

    }

    private static void task3() {
        System.out.println("task3:");
        System.out.println("Enter the text:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pattern = Pattern.compile("text");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Total matches: " + count);
    }

    private static void task4() {
        System.out.println("task4:");
        String str = "1975 1976 1977 1978 1979 1980 1981 1982 1983 1984";
        Pattern pattern = Pattern.compile("(197[7-9]|198[0-2])");
        Matcher matcher = pattern.matcher(str);


        while (matcher.find()) {
            System.out.print(matcher.group() + " ");

        }
        System.out.println();

    }

    private static void task5() {
        System.out.println("task5:");
        String str = "      210.138.12.157    ";

        Pattern pattern = Pattern.compile("((\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}\\b(\\d|[1-9]\\d|1\\d\\d|2[0-4]\\d|25[0-5])\\b");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
