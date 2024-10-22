package homework6.task2;

public class Airplane extends AirTransport{
    public Airplane(int liftingCapacity, int peopleCapacity, String name) {
        super(liftingCapacity, peopleCapacity, name);
    }

    public String toString() {
        return "Airplane{" +
                "LiftingCapacity=" + getPeopleCapacity() +
                ", peopleCapacity=" + getPeopleCapacity() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
