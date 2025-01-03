package Module6.Callable.Homework2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.*;

public class Homework2 {
    static class Task implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            ArrayList<Integer> list = new ArrayList<>();
            Random random = new Random();
            System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
            for (int i = 0; i < 10; i++) {
                list.add(random.nextInt(100));
            }
            System.out.println("Thread " + Thread.currentThread().getName() + " got array " + list);

            int sum = 0;

            for (Integer n : list) {
                sum += n;
            }

            System.out.println("Thread " + Thread.currentThread().getName() + " got sum " + sum);
            return sum;
        }
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ArrayList<Future<Integer>> list = new ArrayList<>();

        try (ExecutorService pool = Executors.newFixedThreadPool(3)) {
            for (int i = 0; i < 10; i++) {
                list.add(pool.submit(new Task()));
            }
        }
        for (Future<Integer> f: list){
            System.out.print(f.isDone() + " ");
            System.out.print(f.get() + " ");
            System.out.println(f.state());
        }
    }
}
