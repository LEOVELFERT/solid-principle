package structural.composite.withoutpattern;

public class FileApp {
    public static void main(String[] args) {
        File pngFile = new File("leo.png");
        File imgFile = new File("leo.img");

        Folder folder = new Folder("dummyFolder");
        Folder importantFolder = new Folder("importantFolder");

        folder.addFile(pngFile);
//        folder.addFile(importantFolder);   // could not add the folder we are facing here. this is the problem.

        folder.addFile(imgFile);
        folder.getDetails();

    }
}
