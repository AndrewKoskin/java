package Module5.Files.Homework2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\koski\\OneDrive\\Документы\\meow\\homework2.txt");
        file.createNewFile();

        FileWriter fw = new FileWriter("C:\\Users\\koski\\OneDrive\\Документы\\meow\\homework2.txt");
        fw.write("This is some text, amount of words here is 16, amount of punctuation marks is 3.");
        fw.close();

        try (FileReader fr = new FileReader("C:\\Users\\koski\\OneDrive\\Документы\\meow\\homework2.txt")){
            Scanner scanner = new Scanner(fr);
            String line = scanner.nextLine();
            System.out.println("Amount of words in given file string is: " + line.split(" ").length);
            for (String elem: line.split("[^a-zA-Z0-9\s]")){
                System.out.println(elem);
            }

            Pattern pattern = Pattern.compile("[.!?\\-,:;()\\[\\]{}\"'<>]");
            Matcher matcher = pattern.matcher(line);

            int punctuationCount = 0;

            // Считаем количество знаков препинания
            while (matcher.find()) {
                punctuationCount++;
            }
            System.out.println("Amount of punctuation marks in given file string is: " + punctuationCount);
        }

    }
}
