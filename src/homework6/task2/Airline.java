package homework6.task2;


import java.util.Scanner;

public class Airline {
    private AirTransport[] airTransports;

    public Airline(AirTransport[] airTransports) {
        this.airTransports = airTransports;
    }
    public int getPeopleCapacity() {
        int result=0;
        for (int i = 0; i < airTransports.length;i++ ) {
            result += airTransports[i].getPeopleCapacity();
        }
        return result;
    }
    public int getLiftingCapacity() {
        int result=0;
        for (int i = 0; i < airTransports.length;i++ ) {
            result += airTransports[i].getLiftingCapacity();
        }
        return result;
    }
    public AirTransport findAirTransportByPeopleCapacity(int maxValue, int minValue) {
        AirTransport result= null;
        for (int i = 0; i < airTransports.length;i++ ) {
            int currentCapacity=airTransports[i].getPeopleCapacity();
            if (currentCapacity >= minValue && currentCapacity <= maxValue) {
                result=airTransports[i];
                return  result;
            }
        }
        return result;
    }
    public AirTransport findAirTransportByLiftingCapacity(int maxValue, int minValue) {
        AirTransport result= null;
        for (int i = 0; i < airTransports.length;i++ ) {
            int currentCapacity=airTransports[i].getLiftingCapacity();
            if (currentCapacity >= minValue && currentCapacity <= maxValue) {
                result=airTransports[i];
                return  result;
            }
        }
        return result;
    }
}
