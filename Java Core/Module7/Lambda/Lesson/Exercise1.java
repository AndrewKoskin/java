package Module7.Lambda.Lesson;

public class Exercise1 {
    static interface Operation {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Hello world!");
        new Thread(runnable).start();
    }
}
