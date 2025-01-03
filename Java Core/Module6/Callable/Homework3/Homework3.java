package Module6.Callable.Homework3;

import Module6.Callable.Homework2.Homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Homework3 {
    static class MyCallable implements Callable<Integer> {
        MyFile file;

        MyCallable(MyFile file) {
            this.file = file;
        }

        @Override
        public Integer call() throws IOException, InterruptedException {
            file.write(new String[]{"Hello World! ", LocalDateTime.now().toString(), Thread.currentThread().getName()});
            return 0;
        }
    }

    static class MyFile {
        File file;

        MyFile(File file) {
            this.file = file;
        }

        synchronized void write(String[] strings) throws IOException {
            StringBuilder sb = new StringBuilder();
            try (FileWriter fw = new FileWriter(file, true)) {
                System.out.println(Thread.currentThread().getName() + " writes to file");
                for (String s : strings) {
                    sb.append(s);
                    sb.append(" ");
                }
                sb.append("\n");
                fw.write(sb.toString());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("callable-homework3.txt");
        file.delete();
        file.createNewFile();
        MyFile myFile = new MyFile(file);

        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 10; i++) {
                pool.submit(new MyCallable(myFile));
            }
        }
    }
}
