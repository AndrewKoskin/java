package Module1.First;

import java.util.Scanner;

public class Homework12 {
    //Надо вывести на экран один или два корня уравнения если они есть, иначе вывести на экран “Корней нет”.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(roots(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }

    public static String roots(int a, int b, int c) {
        int preDescriminant = b * b - 4 * a * c;
        if (preDescriminant >= 0) {
            float descriminant = (float) Math.sqrt(preDescriminant);
            float x1 = (float) ((-b - descriminant) / (2 * a));
            float x2 = (float) ((-b + descriminant) / (2 * a));
            if (x1 == x2) {
                return "Один корень x: " + x1;
            } else {
                return "x1: " + x1 + ", x2: " + x2;
            }
        }else{
            return "Корней нет";
        }
    }
}
