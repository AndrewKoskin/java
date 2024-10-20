package ClassesAndObjects;

public class Homework4 {
    /**
     * Создать класс описывающий Банкомат.
     * Набор купюр, находящихся в банкомате, должен задаваться свойствами: количеством купюр номиналом 20, 50, 100.
     * Сделать методы для добавления денег в банкомат.
     * Сделать метод, снимающий деньги.
     * С клавиатуры передается сумма денег. На экран выводим операция удалась или нет.
     * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма. Создать конструктор с тремя параметрами – количеством купюр разного номинала.
     */
    public static void main(String[] args) {
        Bankomat bankomat1 = new Bankomat(123, 400, 500);
        Bankomat bankomat2 = new Bankomat(1, 1, 1);
        bankomat1.addMoney(0, 0, 1);
        bankomat2.addMoney(1,1,1);
        bankomat1.takeMoney(1000);
        bankomat1.takeMoney(1);
        bankomat2.takeMoney(1000);

    }
}

class Bankomat {
    int current100 = 0;
    int current50 = 0;
    int current20 = 0;


    public Bankomat(int current100, int current50, int current20) {
        this.current100 = current100;
        this.current50 = current50;
        this.current20 = current20;
    }

    public void addMoney(int current100, int current50, int current20) {
        this.current100 += current100;
        this.current50 += current50;
        this.current20 += current20;
    }

    public void takeMoney(int number) {
        if (number > this.current100 + this.current50 + this.current20) {
            System.out.println("Столько в банкомате нет");
        } else if (number % 20 != 0) {
            System.out.println("Такое количество вывести нельзя");
        } else {
            int res100 = number / 100;
            int res50 = number / 100 / 50;
            int res20 = number / 100 / 50 / 20;
            this.current100 -= res100;
            this.current50 -= res50;
            this.current20 -= res20;
            System.out.println("Выдано 100: " + res100 + ", 50: " + res50 + ", 20: " + res20);
        }
    }
}
