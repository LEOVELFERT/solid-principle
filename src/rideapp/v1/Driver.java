package rideapp.v1;

public class Driver {
    String name;
    Vehicle vehicle;
    Location location;

    public Driver(String name, Location location, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
        this.location = location;
    }
}
