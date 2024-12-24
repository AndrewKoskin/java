package Module5.Exceptions.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    static boolean game() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input;
        int answer = random.nextInt(101);
        int number;
        byte counter = 6;
        while (counter > 0) {
            counter--;
            input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (ArithmeticException e) {
                throw new ArithmeticException("This is ArithmeticException, so you probably typed not a number in input argument");
            }catch (NumberFormatException e){
                throw new NumberFormatException("This is NumberFormatException, so you probably entered empty line");
            }
            if (number < 0 || number > 100) {
                throw new NotInRangeException("This is NotInRangeException");
            }
            if (number == answer) {
                System.out.println("You won!");
                return true;
            } else if (number < answer) {
                System.out.println("Your number is less than answer");
            } else {
                System.out.println("Your number is bigger than answer");
            }
        }
        System.out.println("Answer was " + answer);
        return false;
    }

    public static void main(String[] args) {
        System.out.println(game());
    }
}
