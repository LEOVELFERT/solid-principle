package structural.composite.withpattern;

public class File implements FileComponent {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void getDetails() {
        System.out.println("the file Name is : " + fileName);
    }
}
