package rideapp.v2;

public class Car extends Vehicle {
    public Car(String numberPlate) {
        super(numberPlate);
    }

    @Override
    double getFarePerKm() {
        return 20;
    }
}
