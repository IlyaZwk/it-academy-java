package homework11;

public class SentTextBySms implements Command {

    private Messenger messenger;

    public SentTextBySms(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void execute() {
        try {
            messenger.sms();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}