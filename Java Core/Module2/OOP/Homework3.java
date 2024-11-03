package Module2.OOP;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Homework3 {
    public static void main(String[] args) {
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        Rose rose1 = new Rose();
        rose1.setPrice(5000);

        System.out.println(rose.getPrice());
        System.out.println(tulip.getPrice());

        rose.setDate(new GregorianCalendar(2024, 10, 8));
        tulip.setDate(new GregorianCalendar(2024, 10, 10));
        List<Flower> flowers = new ArrayList<>();
        flowers.add(rose);
        flowers.add(tulip);
        flowers.add(rose1);
        Bouquet bouquet = new Bouquet(flowers);

        System.out.println(bouquet.priceOfBouquet());
        System.out.println(bouquet.dateOfAllBouquetDeath());
        System.out.println(bouquet.allBouquetColors());
    }
}

abstract class Flower {
    private int price;
    private Calendar date = new GregorianCalendar(2020, 0, 15);
    private int expirationDays = 7;
    private String color = "Red";

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getExpirationDays() {
        return this.expirationDays;
    }

    public void setExpirationDays(int days) {
        this.expirationDays = days;
    }

    public Calendar getDate() {
        return this.date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class Rose extends Flower {
    Rose() {
        setPrice(100);
    }
}

class Tulip extends Flower {
    Tulip() {
        this.setPrice(200);
        this.setColor("Yellow");
    }
}

class Bouquet {
    List<Flower> bouquet;

    Bouquet(List<Flower> flowers) {
        List<Flower> bouquet = new ArrayList<>(flowers);
        this.bouquet = bouquet;
    }

    public int priceOfBouquet() {
        int resultPrice = 0;
        for (int i = 0; i < this.bouquet.size(); i++) {
            resultPrice += this.bouquet.get(i).getPrice();
        }
        return resultPrice;
    }

    public long dateOfAllBouquetDeath() {
        long time = 0;
        for (int i = 0; i < this.bouquet.size(); i++) {
            if (time < this.bouquet.get(i).getDate().getTimeInMillis()) {
                time = this.bouquet.get(i).getDate().getTimeInMillis();
            }

        }
        return time;
    }

    public String allBouquetColors() {
        String color = "";
        for (int i = 0; i < this.bouquet.size(); i++) {
            if (!color.contains(this.bouquet.get(i).getColor()))
                color += this.bouquet.get(i).getColor() + ", ";
        }
        System.out.println("All bouquet colors: ");
        return "All bouquet colors: " + color;
    }
}