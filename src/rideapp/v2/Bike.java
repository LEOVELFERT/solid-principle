package rideapp.v2;

public class Bike extends Vehicle {
    public Bike(String numberPlate) {
        super(numberPlate);
    }

    @Override
    double getFarePerKm() {
        return 10;
    }
}
