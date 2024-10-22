package homework6.task2;

public abstract class AirTransport {
    private int peopleCapacity;
    private int LiftingCapacity;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public int getLiftingCapacity() {
        return LiftingCapacity;
    }

    public void setLiftingCapacity(int liftingCapacity) {
        LiftingCapacity = liftingCapacity;
    }

    public AirTransport(int liftingCapacity, int peopleCapacity, String name) {
        LiftingCapacity = liftingCapacity;
        this.peopleCapacity = peopleCapacity;
        this.name = name;
    }

    @Override
    public String toString() {
        return "AirTransport{" +
                "LiftingCapacity=" + LiftingCapacity +
                ", peopleCapacity=" + peopleCapacity +
                ", name='" + name + '\'' +
                '}';
    }
}
