package rideapp.v2;

public class StandardFareStrategy implements FareStrategy {
    @Override
    public double calcFare(Vehicle vehicle, double distance) {
        return vehicle.getFarePerKm() * distance;
    }
}
