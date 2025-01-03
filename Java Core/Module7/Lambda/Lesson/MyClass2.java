package Module7.Lambda.Lesson;

public class MyClass2 {
    MyInterface1 myCalculate(int mode) {
        return switch (mode) {
            case (1) -> (x, y) -> x - y;
            case (2) -> (x, y) -> x + y;
            default -> (x, y) -> x * y;
        };
    }

    public static void main(String[] args) {
        MyClass2 myClass = new MyClass2();
        System.out.println(myClass.myCalculate(1).calculate(2,3));
        System.out.println(myClass.myCalculate(2).calculate(2,3));
        System.out.println(myClass.myCalculate(3).calculate(2,3));
    }
}
interface MyInterface1 {
    int calculate(int a, int b);
}
