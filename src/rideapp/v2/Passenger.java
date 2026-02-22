package rideapp.v2;


public class Passenger extends User {
    public Passenger(String name, String email, Location location) {
        super(name, email, location);
    }

    @Override
    void notify(String msg) {
        System.out.println("Passenger"+msg);
    }
    //any other methods??
}
