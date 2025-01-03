package Module7.Lambda.Lesson;

public class Exercise3 {

    @FunctionalInterface
    static interface MathInterface<T> {
        T getMax(T first, T second);
    }

    public static void main(String[] args) {
        MathInterface<Integer> m = (x, y) -> x > y ? x : y;
        System.out.println(m.getMax(2, 2));
    }
}
