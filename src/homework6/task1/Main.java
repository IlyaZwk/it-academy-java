package homework6.task1;

public class Main {
    public static void main(String[] args) {
       Money money1 = new Money(12,50);
       Money money2 = new Money(2,35);
       System.out.println(money1.addMoney(money2));
        System.out.println(money1.subtractMoney(money2));
    }

}