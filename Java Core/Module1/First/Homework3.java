package Module1.First;

public class Homework3 {
    /**
     * Написать метод, который принимает на вход значение промежутка времени в секундах.
     * Метод выводит на экран этот промежуток времени в виде часов минут и секунд, суток и недель.
     */
    public static void main(String[] args) {
        method(431212344);
    }

    public static void method(int time) {
        int weeks = time % (7 * 24 * 60 * 60);
        int days = time % (24 * 60 * 60);
        int minutes = time % (60 * 60);
        int seconds = time % 60;
        System.out.println("Weeks: " + weeks + ", days: " + days + ", minutes: " + minutes + ", seconds: " + seconds);
    }
}
