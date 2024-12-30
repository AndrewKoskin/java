package Module6.Threads.Homework6;

import java.util.Random;

public class Queue {
    private int number = 200;
    private int counter = 0;
    private Random random = new Random();

    synchronized void addNumber() throws InterruptedException {
        while (number >= 100){
            System.out.println("Number is " + number + " all producers is waiting.");
            wait();
        }

        int res = random.nextInt(1, 101);
        System.out.print("Thread " + Thread.currentThread().getName() + " gives " + res + " result is: ");
        number += res;
        System.out.println(number);
        notifyAll();
    }

    synchronized void subtractNumber() throws InterruptedException {
        int res = random.nextInt(1, 101);
        if (number <= 80){
            notifyAll();
        }
        while (number <= 0){
            System.out.println("Number is " + number + ", all consumers are waiting.");
            wait();
        }

        // Не можем купить больше, чем произведено
        if (number <= res){
            res = number;
        }

        System.out.print("Thread " + Thread.currentThread().getName() + " takes " + res + " result is: ");
        number -= res;
        System.out.println(number);

        counter += res;
    }

    int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        Producer p1 = new Producer(queue);
        Producer p2 = new Producer(queue);
        Producer p3 = new Producer(queue);
        Consumer c1 = new Consumer(queue);
        Consumer c2 = new Consumer(queue);
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
    }
}
