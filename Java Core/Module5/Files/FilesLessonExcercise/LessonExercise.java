package Module5.Files.FilesLessonExcercise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LessonExercise {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\Users\\koski\\OneDrive\\Документы\\meow");
        dir.mkdir();

        for (int i = 1; i < 11; i++) {
            File file = new File(dir, "meow" + i + ".txt");
            file.exists();
            try (FileWriter fileWriter = new FileWriter(file); FileReader fileReader = new FileReader(file)) {
                fileWriter.write("meow " + i);
            }

            try (FileReader fileReader = new FileReader(file)) {
                int res = fileReader.read();
                while (res != -1) {
                    System.out.print((char) res);
                    res = fileReader.read();
                }
            }
            System.out.println();

        }
        for (File file : dir.listFiles()) {
            Scanner scanner = new Scanner(file);
            String res;
            System.out.println(file.getName());
            while (scanner.hasNext()){
                res = scanner.nextLine();
                if (res.equals("meow 7")){
                    System.out.println("THIS IS 7TH FILE");
                }
            }
        }
    }
}
