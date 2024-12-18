package homework11;

public class SentTextByMail implements Command {

    private Messenger messenger;

    public SentTextByMail(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void execute() {
        try {
            messenger.mail();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}