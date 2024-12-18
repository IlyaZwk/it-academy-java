package homework11;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Messenger messenger = new Messenger();

        Command TextByMail = new SentTextByMail(messenger);
        Command TextBySms = new SentTextBySms(messenger);

        VariantOfText VariantOfText = new VariantOfText();
        VariantOfText.setCommand(0, TextByMail);
        VariantOfText.setCommand(1, TextBySms);

        VariantOfText.pressButton(0);
        VariantOfText.pressButton(1);
    }

}



