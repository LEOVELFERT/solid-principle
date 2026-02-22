package rideapp.v2.fare;

import rideapp.v2.vehicle.Vehicle;

public interface FareStrategy {
    double calcFare(Vehicle vehicle, double distance);
}
