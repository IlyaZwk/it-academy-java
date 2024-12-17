package homework11;

import java.util.Random;

public class RandomTimeMail {
    Random r = new Random();
    public int randomMinutes = (r.nextInt(59) + 1);
    public int randomHours = (r.nextInt(23) + 1);
    public int hours = randomHours;
    public String minutes = "" + randomMinutes;
    public String time = hours + ":" + minutes;

    @Override
    public String toString() {
        return time;
    }
}
