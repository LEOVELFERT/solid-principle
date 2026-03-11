package structural.flyweight.withpattern;
//FlyWeight
public class ColorType {
    //Intrinsic Property (means it will be shared all the modules)
    private String color;

    public ColorType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
