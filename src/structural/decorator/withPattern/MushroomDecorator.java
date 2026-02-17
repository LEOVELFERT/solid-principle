package structural.decorator.withPattern;

public class MushroomDecorator extends PizzaDecorator {
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " mushroom added";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 3.0;
    }
}
