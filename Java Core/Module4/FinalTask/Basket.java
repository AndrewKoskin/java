package Module4.FinalTask;

import java.util.HashMap;

public class Basket {
    HashMap<Product, Integer> basket = new HashMap<>();

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket +
                '}';
    }
}
