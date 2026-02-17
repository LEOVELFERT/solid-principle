package structural.proxy.withpattern;

public class ProxyImage implements Image {
    private String imageName;
    private RealImage image;

    public ProxyImage(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(imageName);   //image is loaded+cached
        }
        image.display();
    }
}
