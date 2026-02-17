package structural.decorator.withPattern;

public class CheeseDecorator extends PizzaDecorator {
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " cheese added. ";
    }

    @Override
    public Double getCost() {
        return pizza.getCost() + 2.0;
    }
}
