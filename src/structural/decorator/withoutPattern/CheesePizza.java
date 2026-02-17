package structural.decorator.withoutPattern;

public class CheesePizza extends BasicPizza {

    public String getDescription() {
        return super.getDescription() + "cheess added ";
    }

    public Double getCost() {
        return super.getCost() + 2.0;
    }
}
