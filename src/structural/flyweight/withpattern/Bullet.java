package structural.flyweight.withpattern;

public class Bullet {
    private ColorType colorType;
    private int x, y;
    private int velocity;

    public Bullet(String color, int x, int y, int velocity) {
        this.colorType = ColorTypeFactory.getColor(color);
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("============created the bullet===============");
        System.out.println("Bullet color : " + color + " x : " + x + " y : " + y + " velocity : " + velocity);
        System.out.println("============created the bullet===============");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    public void display() {
        System.out.println("============Bullet Info======================");
        System.out.println("Bullet color : " + colorType.getColor() + " x : " + x + " y : " + y + " velocity : " + velocity);
        System.out.println("============Bullet Info======================");
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
    }
}
