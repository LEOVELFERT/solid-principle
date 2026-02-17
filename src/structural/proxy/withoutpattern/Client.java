package structural.proxy.withoutpattern;

public class Client {
    public static void main(String[] args) {
        Image image1 = new RealImage("Leo.img");  // here while intialize the image the image will get loaded.
        Image image2 = new RealImage("Joffy.img");
        image1.display();
        image1.display();    // alreay image loaded but here image is again loading since we are not using caching here.
       //as well as there is no Lazy Loading as well.
    }
}
