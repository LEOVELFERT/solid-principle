package creational.builder.example.withBuilder;

public class House {
    private int doorCount;
    private String nameOfTheHouse;
    private String description;
    private boolean hasKitchen;
    private boolean hasBathroom;
    private boolean hasWindows;

    public House(HouseBuilder builder) {
        this.doorCount = builder.doorCount;
        this.nameOfTheHouse = builder.nameOfTheHouse;
        this.description = builder.description;
        this.hasKitchen = builder.hasKitchen;
        this.hasBathroom = builder.hasBathroom;
        this.hasWindows = builder.hasWindows;
    }

    public void printSummary(){
        System.out.println("--------------------------------------");
        System.out.println("House Details");
        System.out.println("--------------------------------------");
        System.out.println("House Name : "+this.nameOfTheHouse);
        System.out.println("House Description : "+this.description);
        System.out.println("Door Count : "+doorCount);
        System.out.println("House Has Kitchen : "+hasKitchen);
        System.out.println("House Has Bathroom : "+hasBathroom);
        System.out.println("House Has Windows : "+hasWindows);
    }

    @Override
    public String toString() {
        return "House{" +
                "doorCount=" + doorCount +
                ", nameOfTheHouse='" + nameOfTheHouse + '\'' +
                ", description='" + description + '\'' +
                ", hasKitchen=" + hasKitchen +
                ", hasBathroom=" + hasBathroom +
                ", hasWindows=" + hasWindows +
                '}';
    }
}
