package structural.proxy.withpattern;

public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("leoImage");
        image.display();
        image.display();
        image.display();
    }
}
