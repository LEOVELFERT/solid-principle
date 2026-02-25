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
        //1)base case: checking drivers are available or not if not sending messages to them.
        if (availableDrivers.isEmpty()) {
            passenger.notify("Drivers are unAvailable...!");
        }
        //2)find the nearest Driver
        Driver nearestDriver = findNearestDriver(passenger.getLocation());

        //3) once asign the driver we need to remove the driver from the List which means active or not.
        // future we can create some value for driver active or not we can create the enum based on that we can decide.
        availableDrivers.remove(nearestDriver);
        //4) send notification to the passenger like ride scheduledd
        passenger.notify("Ride Scheduled successfully..." + nearestDriver);
        //5) aftewards we need to book the ride based on the distance calculation
        Ride ride = new Ride(passenger, nearestDriver, distance, fareStrategy);
        ride.calculateFare();   //it will caluclate teh fare and store it in the ride object.

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
            double distance = location.calcDistance(driver.getLocation());  //better we can create as the utility method.
            if (minDistance > distance) {
                minDistance = distance;
                nearestDriver = driver;
            }
        }
        return nearestDriver;
    }


    //Ride Matching System----> mediator of Ride,Drive,Passenger
}
