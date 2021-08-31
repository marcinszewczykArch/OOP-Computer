package computer;

import computer.drive.Drive;
import computer.drive.HDDDrive;
import computer.drive.SSDDrive;
import computer.file.File;
import computer.file.ImageFile.GIFImageFile;
import computer.file.ImageFile.JPGImageFile;
import computer.file.MusicFile.MP3MusicFile;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        File plik1mp3 = new MP3MusicFile("plik1.mp3", 2222, "CKOD", "GeneracjaNIC", 909);
        File plik1gif = new GIFImageFile("plik1.gif:", 22);
        File plik1jpg = new JPGImageFile("plik1.jpg", 11, 33);

        List<File> files = new ArrayList<>();
        files.add(plik1mp3);
        files.add(plik1gif);
        files.add(plik1jpg);

        for (File file : files) {
            if (file instanceof JPGImageFile) {
                System.out.println("to plik JPG");
            } else if (file instanceof GIFImageFile){
                    System.out.println("to plik GIF");
                }
            }

        File plik2gif = new GIFImageFile("plik2.gif", 2313);
        System.out.println(plik2gif.getVersion());

        Monitor monitor = new Monitor();
        System.out.println(monitor.MAX_HEIGHT);


    }
    }

