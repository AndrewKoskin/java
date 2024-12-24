package Module5.Exceptions.Homework4;

public class Division {
    static Double divide(String... divideArgs) {
        double result = 0;
        try {
            result = Integer.parseInt(divideArgs[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You got out of bounds. Probably you don't have any elements in divideArgs, result is 0");
        }
        for (int i = 1; i < divideArgs.length; i++) {
            try {
                result /= Integer.parseInt(divideArgs[i]);
            } catch (ArithmeticException e) {
                System.out.println("AE got here, probably you tried division by zero");
            } catch (NumberFormatException e) {
                System.out.println("NFE got here, index " + i + " is not going to result.");
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(divide("1", "2", "asdf", "", "12341234123412341234"));
        System.out.println(divide("1", "0"));
        System.out.println(divide("0", "0"));
        System.out.println(divide());
    }
}
