package structural.decorator.withPattern;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new MushroomDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
