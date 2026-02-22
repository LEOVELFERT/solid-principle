package rideapp.v2;

public interface FareStrategy {
    double calcFare(Vehicle vehicle, double distance);
}
