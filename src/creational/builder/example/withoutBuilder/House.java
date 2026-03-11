package creational.builder.example.withoutBuilder;

public class House {
    private int doorCount;
    private String nameOfTheHouse;
    private String description;
    private boolean hasKitchen;
    private boolean hasBathroom;
    private boolean hasWindows;

    public House(int doorCount, String nameOfTheHouse, String description, boolean hasKitchen, boolean hasBathroom, boolean hasWindows) {
        this.doorCount = doorCount;
        this.nameOfTheHouse = nameOfTheHouse;
        this.description = description;
        this.hasKitchen = hasKitchen;
        this.hasBathroom = hasBathroom;
        this.hasWindows = hasWindows;
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
