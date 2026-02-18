package structural.composite.withpattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileComponent {
    private String folderName;
    private List<FileComponent> fileComponents;

    public Folder(String folderName) {
        this.folderName = folderName;
        fileComponents = new ArrayList<>();
    }

    public void addFileCompoenent(FileComponent fileComponent) {
        fileComponents.add(fileComponent);
    }

    @Override
    public void getDetails() {
        System.out.println("==============Folder: "+folderName+"========================");
        for (FileComponent fileComponent : fileComponents) {
            fileComponent.getDetails();
        }
        System.out.println("==============Folder: "+folderName+"========================");
    }
}
