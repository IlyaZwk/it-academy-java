package homework11;

public class VariantOfText {

   private Command[] commands;

   public VariantOfText() {
       commands = new Command[2];
   }

   public void setCommand(int slot, Command command) {
       commands[slot] = command;
   }

   public void pressButton(int slot) {
       if (commands[slot] != null) {
           commands[slot].execute();
       }
   }
}