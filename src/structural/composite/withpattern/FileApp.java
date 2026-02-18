package structural.composite.withpattern;

public class FileApp {
    public static void main(String[] args) {
        //videoFiles
        File sreenathVideo = new File("sreenath.mp4");
        File anupVideo = new File("anup.mp4");
        File abuVideo = new File("abu.mp4");
        //imageFile
        File sreenathAnoopimage = new File("sreenath-anoop.img");
        //Folder
        Folder sreenathFolder = new Folder("Sreeenath Fils");
        Folder anoopFolder = new Folder("Anup Files");
        //Folder
        Folder padmaFolder = new Folder("Padma Series");

        sreenathFolder.addFileCompoenent(abuVideo);
        sreenathFolder.addFileCompoenent(sreenathVideo);

        anoopFolder.addFileCompoenent(anupVideo);
        anoopFolder.addFileCompoenent(sreenathAnoopimage);

        padmaFolder.addFileCompoenent(sreenathFolder);
        padmaFolder.addFileCompoenent(anoopFolder);

        padmaFolder.getDetails();

    }
}
