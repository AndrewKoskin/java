package Strings;

public class Homework1 {
    /**
     * Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
     * 1) Распечатать последний символ строки. Используем метод String.charAt().
     * 2) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
     * 3) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
     * 4) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
     * 5) Найти позицию подстроки “Java” в строке “I like Java!!!”.
     * 6) Заменить все символы “а” на “о”.
     * 7) Преобразуйте строку к верхнему регистру.
     * 8) Вырезать строку "Java" c помощью метода String.substring().
     */
    public static void method(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str);
        System.out.println(str.toUpperCase());
        System.out.println(str.replace("Java", ""));
        System.out.println(str.substring(0, str.indexOf("J")) + str.substring(str.indexOf("!")));
    }

    public static void main(String[] args) {

        method("I like Java!!!");

    }

}
