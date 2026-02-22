package rideapp.v1;

public class Client {
    public static void main(String[] args) {
        Location loc1 = new Location(12.9716, 77.5946);
        Location loc2 = new Location(13.9716, 78.5946);
        Location loc3 = new Location(14.9716, 79.5946);

        //create Vehicles
        Vehicle car = new Vehicle("AB1234", "Car");
        Vehicle bike = new Vehicle("CD1234", "Bike");

        //create Drivers
        Driver driver1 = new Driver("Alice", loc2, car);
        Driver driver2 = new Driver("Jhon", loc2, bike);

        //Create Passengers
        Passenger passenger1 = new Passenger("Jhon", loc1);
        Passenger passenger2 = new Passenger("Rahul", loc3);

        //Ride Sharing
        RideSharingApp app = new RideSharingApp();
        app.addDriver(driver1);
        app.addDriver(driver2);

        app.addPassenger(passenger1);
        app.addPassenger(passenger2);

        //Book the Ride
        app.bookRide(passenger1, 10);
        app.bookRide(passenger2, 200);

    }
}
