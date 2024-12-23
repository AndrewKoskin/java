package Module5.Exceptions.ExceptionLessonExercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LessonExercise {

    static void readFile(String file) {
        String line;
        try {
            BufferedReader fin = new BufferedReader(new FileReader(file));
            while ((line = fin.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No Meow.txt");
        } catch (IOException e) {
            System.out.println("IOE exception");
        } finally {
            System.out.println("There is finally, works every time!");
        }

    }

    static void readFile1(String file) throws IOException{
        String line;
        BufferedReader fin = new BufferedReader(new FileReader(file));
        while ((line = fin.readLine()) != null) {
            System.out.println(line);
        }

    }

    public static void main(String[] args) throws IOException {
        readFile("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\ExceptionLessonExercise\\Meow.txt");
        readFile1("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\ExceptionLessonExercise\\Meow.txt");
    }
}
