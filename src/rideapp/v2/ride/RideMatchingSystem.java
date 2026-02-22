package rideapp.v2.ride;

import rideapp.v2.location.Location;
import rideapp.v2.fare.FareStrategy;
import rideapp.v2.user.Driver;
import rideapp.v2.user.Passenger;

import java.util.ArrayList;
import java.util.List;

public class RideMatchingSystem {
    List<Driver> availableDrivers = new ArrayList<>();

    public void addDriver(Driver driver) {
        availableDrivers.add(driver);
    }

    public void requestRide(Passenger passenger, double distance, FareStrategy fareStrategy) {
        //base case
        if (availableDrivers.isEmpty()) {
            passenger.notify("Drivers are unAvailable...!");
        }
        //find the nearest Driver
        Driver nearestDriver = findNearestDriver(passenger.getLocation());

        //Mediator
        availableDrivers.remove(nearestDriver);
        passenger.notify("Ride Scheduled successfully..." + nearestDriver);

        Ride ride = new Ride(passenger, nearestDriver, distance, fareStrategy);
        ride.calculateFare();

        passenger.notify("Ride scheduled with fare + Rs" + ride.getFare());
        nearestDriver.notify("you have a new ride request for " + ride.getFare());

        //change the status of the ride
        ride.updateStatus(RideStatus.ONGOING);

        //after some time ride has been completed so we have updated into the completed
        ride.updateStatus(RideStatus.COMPLETED);

        availableDrivers.add(nearestDriver);

    }

    private Driver findNearestDriver(Location location) {
        double minDistance = Double.MAX_VALUE;
        Driver nearestDriver = null;
        for (Driver driver : availableDrivers) {
            double distance = location.calcDistance(driver.getLocation());
            if (minDistance > distance) {
                minDistance = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }


    //Ride Matching System----> mediator of Ride,Drive,Passenger
}
