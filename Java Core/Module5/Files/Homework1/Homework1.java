package Module5.Files.Homework1;

import java.io.File;
import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) {
        File file = new File("c:/");
        System.out.println(file.isDirectory());
        ArrayList<File> files = new ArrayList<>();
        ArrayList<File> directories= new ArrayList<>();

        for (File f : file.listFiles()) {
            if (f.isFile()){
                files.add(f);
            }else {
                directories.add(f);
            }
        }
        System.out.println("Files:");
        for (File f: files){
            System.out.println(f.getName());
        }
        System.out.println();
        System.out.println("Directories: ");
        for (File f: directories){
            System.out.println(f.getName());
        }

    }
}
