package First;

public class Homework7 {
    /**
     * Написать метод, принимающий на вход координаты двух точек и возвращающий длину отрезка между этими точками.
     * При тестировании координаты вводить с клавиатуры.
     * Подсказка: использовать класс Math и формулу расчета отрезка по координатам двух точек.
     */
    public static void main(String[] args) {
        System.out.println(segmentLength(100,0,100,0));
    }

    public static float segmentLength(int x1, int x2, int y1, int y2) {
        return (float) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
    }
}
