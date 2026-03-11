package creational.builder.example.withBuilder;

public class Client {
    public static void main(String[] args) {
        //build simple house
        House simpleHouse = new HouseBuilder("Vinnarasi", 4)
                .build();

        simpleHouse.printSummary();

        //some grant House
        House house = new HouseBuilder("Roshan", 6)
                .setHasWindows(true)
                .setDescription("nallathea ninai nallathea nadakkum")
                .setHasBathroom(true)
                .setHasKitchen(true)
                .build();

        house.printSummary();

    }
}
