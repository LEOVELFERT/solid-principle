package structural.composite.withoutpattern;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<File> files;    // here we can add only files not folder / but folder can contain either foldr or files

    public Folder(String folderName) {
        this.folderName = folderName;
        this.files = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void getDetails() {
        for (File file : files) {
            file.getDetails();
        }
    }
}
