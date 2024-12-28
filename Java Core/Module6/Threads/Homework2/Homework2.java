package Module6.Threads.Homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Homework2 implements Runnable {
    String name;

    @Override
    public void run() {
        this.name = Thread.currentThread().getName();
        File file = new File("homework2file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("IOE catch in file, thread " + this.name);
        }

        Random random = new Random();
        Integer[] ints = new Integer[10];

        for (int i = 0; i < 10; i++) {
            ints[i] = random.nextInt();
        }
        System.out.println("ints in " + this.name + " is: " + Arrays.toString(ints));

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(Arrays.toString(ints));
        } catch (IOException e) {
            System.out.println("IOE catch in fileWriter, thread " + this.name);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Homework2()).start();
        }
    }
}
