package structural.proxy.withpattern;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("leoImage");
        image.display(); // took 5 min
        image.display();  // taken from cache
        image.display();  // taken from cache
    }
}
