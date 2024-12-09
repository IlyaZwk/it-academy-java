package homework11;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.Exchanger;

public class Homework11 {

    public static void main(String[] args) throws InterruptedException {
        Random r = new Random();
        int hours=(r.nextInt(23) + 1);
        int minutes=(r.nextInt(59) + 1);
        String time = hours + ":" + minutes;
        User user1 = new User("Grigoriy", "grisha2001@gmail.com", +3750000);
        User user2 = new User("Dmitry", "dima1998@gmail.com", +3751111);
        Exchanger<String> exchanger = new Exchanger<>();
        System.out.println("Choose a variant of message, type sms or mail:");
        Scanner sc = new Scanner(System.in);
        String choose = sc.next();
        if (Objects.equals(choose, "sms")) {
            Thread thread1 = new Thread(() -> {
                String message = null;
                try {
                    message = exchanger.exchange("Hello from " + user1.getName());
                    System.out.println("Grigoriy got message from " + user2.getNumber() + ", message: " + message + ", time the message was sent " + time);
                } catch (InterruptedException ignored) {
                }
            });

            Thread thread2 = new Thread(() -> {
                String message = null;
                try {
                    message = exchanger.exchange("Hello from " + user2.getName());
                    System.out.println("Dmitry got message from " + user1.getNumber() + ", message: " + message + ", time the message was sent " + time);
                } catch (InterruptedException ignored) {
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
        } else if (Objects.equals(choose, "mail")) {
            Thread thread1 = new Thread(() -> {
                String message = null;
                try {
                    message = exchanger.exchange("Hello from " + user1.getName());
                    System.out.println("Grigoriy got message from " + user2.getMail() + ", message: " + message + ", time the message was sent " + time);
                } catch (InterruptedException ignored) {
                }
            });

            Thread thread2 = new Thread(() -> {
                String message = null;
                try {
                    message = exchanger.exchange("Hello from " + user2.getName());
                    System.out.println("Dmitry got message from " + user1.getMail() + ", message: " + message + ", time the message was sent " + time);
                } catch (InterruptedException ignored) {
                }
            });

            thread1.start();
            thread2.start();

            thread1.join();
            thread2.join();
        }

    }

}



