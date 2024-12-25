package Module5.Files.Homework3;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        String target_dir = "C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\Files\\dir1\\dir2\\dir3";

        // Создается новая директория
        File dir = new File(target_dir);
        dir.mkdirs();

        // Создаются файлы в директории
        for (int i = 1; i < 6; i++) {
            File file = new File(target_dir + "\\file" + i + ".txt");
            file.createNewFile();
        }

        // Файлы заполняются рандомными числами до 100 включительно
        Random random = new Random();
        for (int i = 1; i < 6; i++) {
            try (FileWriter fw = new FileWriter(target_dir + "\\file" + i + ".txt")) {
                for (int j = 0; j < 10; j++) {
                    fw.write(random.nextInt(101) + " ");
                }
            }
        }

        // batya.txt заполняется содержимым первой строки каждого файла
        try (FileWriter fw = new FileWriter(target_dir + "\\batya.txt");) {
            String line;
            for (int i = 1; i < 6; i++) {
                try (FileReader fr = new FileReader(target_dir + "\\file" + i + ".txt")) {
                    Scanner sc = new Scanner(fr);
                    line = sc.nextLine();
                    fw.write("File file" + i + ".txt:\n");
                    fw.write(line + "\n");
                }
            }
        }

        // files of dir3.txt заполняется именами файлов dir3
        try (FileWriter fw = new FileWriter(target_dir + "\\files of dir3.txt")) {
            File file = new File(target_dir);
            for (File f : file.listFiles()) {
                fw.write(f.getName() + "\n");
            }
        }
    }
}
