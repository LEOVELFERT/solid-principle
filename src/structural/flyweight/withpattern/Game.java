package structural.flyweight.withpattern;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Bullet> bullets = new ArrayList<>();
        //creating red the bullet
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("red", 1, 2, 30);
            bullets.add(bullet);
        }

        //creating green the bullet
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("green", 1, 2, 30);
            bullets.add(bullet);
        }

        for (Bullet bullet : bullets) {
            System.out.println("-------------------------Bullet Details------------------------");
            bullet.display();
            System.out.println("-------------------------Bullet Details------------------------");
        }
    }
}
