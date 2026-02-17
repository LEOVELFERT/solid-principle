package structural.decorator.withoutPattern;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza basicPizza = new BasicPizza();
        System.out.println(basicPizza.getDescription());
        System.out.println(basicPizza.getCost());

        Pizza cheeeseMushroomPizza = new CheeseMushroomPizza();
        System.out.println(cheeeseMushroomPizza.getDescription());
        System.out.println(cheeeseMushroomPizza.getCost());
    }
}
