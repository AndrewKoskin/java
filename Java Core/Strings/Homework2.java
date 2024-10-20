package Strings;

public class Homework2 {
    /**
     * Напишите два цикла, выполняющих 100_000 сложений строк вида "aaabbbccc", один с помощью оператора сложения, а
     * другой с помощью StringBuilder и метода append. Сравнить, вывести сравнение на экран
     *
     * @param args
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String str = "aaabbbccc";
        StringBuilder stringBuilder = new StringBuilder("aaabbbccc");

        for (int i = 0; i < 100_000; i++) {
            str += "aaabbbccc";
        }
        long endTime = System.nanoTime();
        System.out.println("Estimating time for string concatenation: " + (endTime - startTime));

        startTime = System.nanoTime();
        for (int i = 0; i < 100_000; i++) {
            stringBuilder.append("aaabbbccc");
        }
        endTime = System.nanoTime();
        System.out.println("Estimating time for StringBuffer append : " + (endTime - startTime));
    }
}
