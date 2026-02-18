package structural.composite.withoutpattern;

public class File {
    private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    public void getDetails() {
        System.out.println("The file Name is : " + fileName);
    }
}
