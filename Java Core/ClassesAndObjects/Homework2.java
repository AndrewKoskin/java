package ClassesAndObjects;

public class Homework2 {
    /**
     * Создайте класс, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.
     * ○ Конструктор класса должен инициализировать эти два поля.
     * ○ Создайте метод класса, который будет выводить дробь в текстовой строке в формате x / y;
     * ○ Создайте метод, умножающий текущую дробь на число типа double, переданное методу в параметре и возвращающий дробь - результат умножения;
     * ○ Создайте метод, делящий текущую дробь на число типа double, переданное ему в параметре и возвращающий дробь - результат деления.
     */
    public static void main(String[] args) {
        Fraction fraction = new Fraction(123, 123);
        System.out.println(fraction.divideFraction(12.3));
        System.out.println(fraction.multiplyFraction(123.3));
        fraction.getFraction();

    }
}


class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void getFraction() {
        System.out.println(this.numerator + " / " + denominator);
    }

    public double multiplyFraction(double number) {
        return number * this.numerator / this.denominator;
    }

    public double divideFraction(double number) {
        return (double) this.numerator / this.denominator / number;
    }
}