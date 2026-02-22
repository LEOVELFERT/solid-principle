package rideapp.v2.fare;


import rideapp.v2.vehicle.Vehicle;

public class StandardFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }
}
