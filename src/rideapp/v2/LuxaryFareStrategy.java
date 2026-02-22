package rideapp.v2;

public class LuxaryFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 1.50;
    }
}
