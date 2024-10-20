package homework6.task2;

public class Helicopter extends AirTransport {


    public Helicopter(int liftingCapacity, int peopleCapacity, String name) {
        super(liftingCapacity, peopleCapacity, name);
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "LiftingCapacity=" + getPeopleCapacity() +
                ", peopleCapacity=" + getPeopleCapacity() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
