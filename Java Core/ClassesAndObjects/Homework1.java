package ClassesAndObjects;

import java.util.Arrays;

public class Homework1 {
    /**
     * Создайте класс Phone, который содержит поля number, model и weight
     * ○ Создайте три объекта (экземпляра) этого класса.
     * ○ Выведите в консоль значения полей объектов.
     * ○ Добавьте в класс Phone методы:
     * - receiveCall (один параметр – имя звонящего). Выводит на консоль сообщение “Звонит {name}”.
     * - getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов
     * ○ Добавить второй метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
     * ○ Создать метод sendMessage с входным параметром - массив номеров телефонов, которым надо отправить сообщение. Метод выводит на консоль номера этих телефонов.
     */
    public static void main(String[] args) {
        Phone nokia = new Phone();
        Phone apple = new Phone();
        Phone samsung = new Phone();

        System.out.println(nokia.model);
        System.out.println(nokia.weight);
        System.out.println(nokia.number);

        apple.receiveCall("Andrew");
        samsung.receiveCall("Andrew", 8_888_888_88_88L);
        System.out.println(nokia.getNumber());
        long[] numbers = {8_888_888_88_88L, 192123123L};
        nokia.sendMessage(numbers);
    }
}

class Phone {
    long number;
    String model;
    String weight;

    Phone() {
        this.number = 8_800_555_35_35L;
        this.model = "Flagman";
        this.weight = "Polkilo";
    }

    public void receiveCall(String name) {
        System.out.println(name);
    }

    public void receiveCall(String name, long number) {
        System.out.println(name + ' ' + number);
    }

    public long getNumber() {
        return this.number;
    }

    public void sendMessage(long[] arrayNumbers) {
        System.out.println(Arrays.toString(arrayNumbers));
    }

}
