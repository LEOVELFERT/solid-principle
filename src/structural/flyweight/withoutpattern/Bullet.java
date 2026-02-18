package structural.flyweight.withoutpattern;

public class Bullet {
    private String color;      // instrisic propery shared by all bullets
    private int x, y;          // Extrinsic property unique to each bullet
    private int velocity;      // Extrinsic property uniqu to each bullet

    public Bullet(String color, int x, int y, int velocity) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.velocity = velocity;
        System.out.println("============created the bullet===============");
        System.out.println("Bullet color : " + color + " x : " + x + " y : " + y + " velocity : " + velocity);
        System.out.println("=============================================");
    }

    public void display() {
        System.out.println("============Bullet Info======================");
        System.out.println("Bullet color : " + color + " x : " + x + " y : " + y + " velocity : " + velocity);
        System.out.println("=============================================");
    }
}
