package homework6.task2;

public class Main {
    public static void main(String[] args) {
        AirTransport airplane = new Airplane(25, 50,"B61");
        AirTransport helicopter = new Helicopter(5, 10,"Gd-7");
        AirTransport plane = new Plane(15, 25,"SuT-78");
        AirTransport[] airTransports = {airplane, helicopter, plane};
        Airline airline = new Airline(airTransports);
        System.out.println("Airline People capacity: " + airline.getPeopleCapacity());
        AirTransport airTransport = airline.findAirTransportByPeopleCapacity(30, 10);
        AirTransport airTransport1 = airline.findAirTransportByLiftingCapacity(30, 10);

        System.out.println("Suitable by people capacity: " + airTransport);
        System.out.println("Suitable by lifting capacity: " + airTransport1);
    }
}
