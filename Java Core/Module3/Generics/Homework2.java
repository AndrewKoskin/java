package Module3.Generics;

import org.w3c.dom.ls.LSOutput;

public class Homework2 {
    public static void main(String[] args) {
        int a = 1;
        long b = 2;
        double c = 3;
        Number[] digits = new Number[3];
        digits[0] = a;
        digits[1] = b;
        digits[2] = c;
        Digit<Number> digit = new Digit<>(digits);
        System.out.println(digit.getDigits(0));
        System.out.println(digit.getDigits(1));
        System.out.println(digit.getDigits(2));
    }
}

class Digit<T extends Number> {
    T[] digits;

    public Digit(T[] digits){
        this.digits = digits;
    }

    public T getDigits(int index){
        System.out.println(this.digits[index]);
        return null;
    }

}