package structural.proxy.withoutpattern;

public class RealImage implements Image {
    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading image more than 20 minutes....");
    }

    @Override
    public void display() {
        //another costly process will consume lots of memory
        System.out.println("The image name is" + imageName);
    }
}
