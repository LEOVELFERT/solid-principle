package structural.decorator.withoutPattern;

public class CheeseMushroomPizza extends CheesePizza {
    public String getDescription() {
        return super.getDescription() + "mushroom added ";
    }

    public Double getCost() {
        return super.getCost() + 2.0;
    }
}
