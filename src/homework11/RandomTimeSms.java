package homework11;

import java.util.Random;

public class RandomTimeSms {
    Random r = new Random();
    int randomMinutes = (r.nextInt(59) + 1);
    int randomHours = (r.nextInt(23) + 1);
    int hours = randomHours;
    String minutes = "" + randomMinutes;
    String time = hours + ":" + minutes;

    @Override
    public String toString() {
        return time;
    }
}
