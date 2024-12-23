package Module4.Map.Homework1;

import java.util.*;

public class Toy {
    private String toyName = "Default Toy";
    private int toyAgeRestriction = 0;
    private double toyPrice = 10;


    @Override
    public String toString() {
        return "Toy{" +
                "toyName='" + toyName + '\'' +
                ", toyAgeRestriction=" + toyAgeRestriction +
                ", toyPrice=" + toyPrice +
                '}';
    }

    public void setToyAgeRestriction(int toyAgeRestriction) {
        this.toyAgeRestriction = toyAgeRestriction;
    }

    public int getToyAgeRestriction() {
        return toyAgeRestriction;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyPrice(double toyPrice) {
        this.toyPrice = toyPrice;
    }

    public double getToyPrice() {
        return toyPrice;
    }

    public static void main(String[] args) {
        Toy toy = new Toy();
        Toy toy1 = new Toy();
        Toy toy2 = new Toy();
        toy1.setToyName("Toy1");
        toy1.setToyPrice(20);
        toy1.setToyAgeRestriction(5);
        toy2.setToyName("Toy2");
        toy2.setToyPrice(30);
        toy2.setToyAgeRestriction(10);
        HashMap<String, Toy> toyHashMap = new HashMap<>();
        toyHashMap.put(toy.getToyName(), toy);
        toyHashMap.put(toy1.getToyName(), toy1);
        toyHashMap.put(toy2.getToyName(), toy2);

        for (Map.Entry<String, Toy> toyEntry : toyHashMap.entrySet()) {
            System.out.println("Name: " + toyEntry.getKey() + "\nToy:  " + toy);
        }

        Set<String> names = toyHashMap.keySet();

        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        Collection<Toy> toys = toyHashMap.values();
        for (Toy elem: toys){
            System.out.println(elem);
        }

    }
}
