package Module6.Callable.LessonExercise;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.concurrent.*;

public class LessonExercise {
    static class MyCallable implements Callable<List<String>> {
        String name;

        MyCallable(String name) {
            this.name = name;
        }

        @Override
        public List call() throws Exception {
            Random random = new Random();
            System.out.println(Thread.currentThread().getName() + " is created!");
            File dir = new File("callable");
            dir.mkdir();

            // Список файлов, созданных потоком как результат
            List<String> list = new LinkedList<>();
            for (int i = 0; i < 10; i++) {
                String filename = dir.getName() + Thread.currentThread().getName() + "-file-" + i + ".txt";
                File file = new File(dir, name + Thread.currentThread().getName() + "-file-" + i + ".txt");
                System.out.println(Thread.currentThread().getName() + " is creating file " + i);

                // Тупо вписываем по циферке в строку
                try (FileWriter fw = new FileWriter(file)) {
                    for (int j = 0; j < 10; j++) {
                        fw.write(j + "\n");
                    }
                }
                list.add(filename);
            }

            // Спим, чтобы наглядно продемонстрировать, что более трех потоков одновременно пул не выдаст
            Thread.sleep(random.nextInt(1000, 3000));
            return list;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<List<String>>> futures = new LinkedList<>();
        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 10; i++) {
                Callable<List<String>> myCallable = new MyCallable(Integer.toString(i));

                // Future вернет нам результат выполнения myCallable
                Future<List<String>> future = pool.submit(myCallable);
                futures.add(future);
            }
        }
        for (Future<List<String>> f: futures){

            // future.get - выдает return в методе call у потока
            System.out.println(f.get());
        }
    }
}
