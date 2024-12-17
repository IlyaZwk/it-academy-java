package homework11;

public class Messenger {
    User user1 = new User("Grigoriy", "grisha2001@gmail.com", +3750000);
    User user2 = new User("Dmitry", "dima1998@gmail.com", +3751111);
    RandomTimeMail timeMail = new RandomTimeMail();
    RandomTimeSms timeSms = new RandomTimeSms();
    String message;

    public void mail() throws InterruptedException {
        message = ("Hello from " + user1.getName());
        System.out.println("Grigoriy got message from " + user2.getMail() + ", message: " + message + ", time the message was sent: " + timeMail);
    }

    public void sms() throws InterruptedException {
        message = ("Hello from " + user2.getName());
        System.out.println("Dmitry got message from " + user1.getNumber() + ", message: " + message + ", time the message was sent: " + timeSms);
    }

}
