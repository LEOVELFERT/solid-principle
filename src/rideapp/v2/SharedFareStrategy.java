package rideapp.v2;

public class SharedFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance * 0.50;
    }
}
