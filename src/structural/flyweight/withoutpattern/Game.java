package structural.flyweight.withoutpattern;

public class Game {
    public static void main(String[] args) {
        //creating red the bullet
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("red", 1, 2, 30);
        }

        //creating green the bullet
        for (int i = 0; i < 5; i++) {
            Bullet bullet = new Bullet("green", 1, 2, 30);
        }

        //Problem:
        //Memory Overhead : Every Bullets store redundant data
        //Performance : slow performance when many bullets using lots of memory
    }
}
