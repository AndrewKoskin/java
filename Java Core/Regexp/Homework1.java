package Regexp;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework1 {
    // Введите с клавиатуры строку. Найти в строке знаки препинания. Подсчитать общее их количество
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matcher matcher = Pattern.compile("\b").matcher(scanner.nextLine());
        int result = 0;
        while (matcher.find()){
            result += matcher.group().length();
        }
        System.out.println(result);
    }
}
