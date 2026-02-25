package rideapp.v2;


import rideapp.v2.fare.StandardFareStrategy;
import rideapp.v2.location.Location;
import rideapp.v2.ride.RideMatchingSystem;
import rideapp.v2.user.Driver;
import rideapp.v2.user.Passenger;
import rideapp.v2.vehicle.Bike;
import rideapp.v2.vehicle.Car;
import rideapp.v2.vehicle.Vehicle;

public class Client {
    public static void main(String[] args) {
        Location loc1 = new Location(12.9716, 77.5946);
        Location loc2 = new Location(13.9716, 78.5946);
        Location loc3 = new Location(14.9716, 79.5946);

        //create Vehicles
        Vehicle car = new Car("AB1234");
        Vehicle bike = new Bike("CD1234");

        //create Drivers
        Driver driver1 = new Driver("Alice", "alice@gmai.com", loc2, car);
        Driver driver2 = new Driver("Jhon", "jhone@gmail.com", loc2, bike);

        //Create Passengers
        Passenger passenger1 = new Passenger("Jhon", "jhon@gmail.com", loc1);
        Passenger passenger2 = new Passenger("Rahul", "jhon@gmail.com", loc3);

        RideMatchingSystem rideMatchingSystem = new RideMatchingSystem();   //Liskov
        rideMatchingSystem.addDriver(driver1);
        rideMatchingSystem.addDriver(driver2);


        rideMatchingSystem.requestRide(passenger1,10,new StandardFareStrategy());
    }
}
