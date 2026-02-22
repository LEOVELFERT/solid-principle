package rideapp.v2;

public class Location {
    private double lattitude;
    private double longitude;


    public Location(double lattitude, double longitude) {
        this.lattitude = lattitude;
        this.longitude = longitude;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double calcDistance(Location loc) {
        //Euclidien Distance Formula
        double dx = this.getLattitude() - loc.getLongitude();
        double dy = this.getLongitude() - loc.getLongitude();

        return Math.sqrt(dx * dx - dy * dy);
    }
}
