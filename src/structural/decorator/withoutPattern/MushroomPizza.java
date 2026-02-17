package structural.decorator.withoutPattern;

public class MushroomPizza extends BasicPizza {

    public String getDescription() {
        return super.getDescription() + "mushroom added ";
    }

    public Double getCost() {
        return super.getCost() + 2.0;
    }
}
