package creational.builder.example.withoutBuilder;

public class Client {
    public static void main(String[] args) {
        House house = new House(2, "Leo", "welcome to the leos house", true, true, true);
        house.printSummary();
    }
}
