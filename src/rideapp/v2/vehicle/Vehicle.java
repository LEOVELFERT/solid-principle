package rideapp.v2.vehicle;

public abstract class Vehicle {
    protected String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    //Fare Calculation
    public abstract double getFarePerKm();
}
