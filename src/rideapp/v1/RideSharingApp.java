package rideapp.v1;

import java.util.ArrayList;
import java.util.List;

public class RideSharingApp {
    private List<Driver> drivers = new ArrayList<>();
    private List<Passenger> passangers = new ArrayList<>();

    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addPassenger(Passenger passenger) {
        passangers.add(passenger);
    }

    //
    public void bookRide(Passenger customer, double distance) {
        //corner case
        if (drivers.isEmpty()) {
            System.out.println("No drivers are available for " + customer.getName());
        }
        //Hard-coded assingment logic
        //find nearest driver
        //O(N) Brute Force

        Driver assignedDriver = null;
        double minDistance = Double.MAX_VALUE;

        for (Driver driver : drivers) {
            double currentDriverDistance = calcDistance(customer.location, driver.location);
            if (currentDriverDistance < minDistance) {
                minDistance = currentDriverDistance;
                assignedDriver = driver;
            }
        }

        //fare calculation
        double expectedFare = calcFare(assignedDriver.vehicle, distance);
        //show the driver fare to the passenger
        System.out.println("Ride Booked for " + customer.name + " with driver " +
                assignedDriver.name + " for a fare of " + expectedFare);
        System.out.println("your rider is on the way " + assignedDriver.name);
    }


    private double calcDistance(Location loc1, Location loc2) {
        //Euclidien Distance Formula
        double dx = loc1.getLattitude() - loc2.getLongitude();
        double dy = loc2.getLongitude() - loc2.getLongitude();

        return Math.sqrt(dx * dx - dy * dy);
    }

    private double calcFare(Vehicle vehicle, double distance) {
        if ("Car".equalsIgnoreCase(vehicle.getType())) {
            return distance * 20;
        } else if (vehicle.getType().equals(10)) {
            return distance * 10;
        } else {
            return distance * 8;
        }
    }


    //Violations
    //----------
    // SRP- this class does have multiple funcionalities 1)Drivers ,Passengers,RideBooking,Fare Calculation, Distance Calculation
    // OCP- not that much easy to follow  OCP here
    // LSP - Vehicle class breaks LSP here
    // ISP - In better way we can segragate interface and we can use it wisely here
    // DSP - This App has the Low level implemenations it should not be like that .
}
