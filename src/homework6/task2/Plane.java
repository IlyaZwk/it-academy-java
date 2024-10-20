package homework6.task2;

public class Plane extends AirTransport{
    public Plane(int liftingCapacity, int peopleCapacity, String name) {
        super(liftingCapacity, peopleCapacity, name);
    }

    public String toString() {
        return "Plane{" +
                "LiftingCapacity=" + getPeopleCapacity() +
                ", peopleCapacity=" + getPeopleCapacity() +
                ", name='" + getName() + '\'' +
                '}';
    }
}
