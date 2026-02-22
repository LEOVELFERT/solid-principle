package rideapp.v2.user;


import rideapp.v2.location.Location;
import rideapp.v2.vehicle.Vehicle;

public class Driver extends User {
    private Vehicle vehicle;

    public Driver(String name, String email, Location location, Vehicle vehicle) {
        super(name, email, location);
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return this.vehicle;
    }

    @Override
    public void notify(String msg) {
        System.out.println("Driver" + msg);
    }
}
