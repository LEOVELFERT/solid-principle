package structural.decorator.withoutPattern;

public class BasicPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Basic pizza with boiled";
    }

    @Override
    public Double getCost() {
        return 5.0;
    }
}
