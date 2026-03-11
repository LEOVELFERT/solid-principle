package creational.builder.example.withBuilder;

public class HouseBuilder {
    public int doorCount;
    public String nameOfTheHouse;
    public String description;
    public boolean hasKitchen;
    public boolean hasBathroom;
    public boolean hasWindows;

    //setting with mandatory fields
    public HouseBuilder(String nameOfTheHouse, int doorCount) {
        this.nameOfTheHouse = nameOfTheHouse;
        this.doorCount = doorCount;
    }

    public HouseBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    public HouseBuilder setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
        return this;
    }

    public HouseBuilder setHasBathroom(boolean hasBathroom) {
        this.hasBathroom = hasBathroom;
        return this;
    }

    public HouseBuilder setHasWindows(boolean hasWindows) {
        this.hasWindows = hasWindows;
        return this;
    }

    public House build() {
        return new House(this);
    }
}
