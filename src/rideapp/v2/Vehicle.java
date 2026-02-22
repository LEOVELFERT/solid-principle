package rideapp.v2;

abstract class Vehicle {
    protected String numberPlate;

    public Vehicle(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    //Fare Calculation
    abstract double getFarePerKm();
}
