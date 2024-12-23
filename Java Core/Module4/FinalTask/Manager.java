package Module4.FinalTask;

import java.util.*;
import java.util.Map.Entry;

public class Manager {
    static void addProduct(Product product, Integer numOfProduct, Basket basket) {
        basket.basket.put(product, basket.basket.getOrDefault(product, 0) + numOfProduct);
    }

    static void getCheck(Basket basket) {
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry<Product, Integer> productEntry : basket.basket.entrySet()) {
            stringBuilder.append("Product " + productEntry.getKey().name + " costs " +
                    productEntry.getKey().price + ", it's count is " + productEntry.getValue() + "\n");
            sum += productEntry.getKey().price * productEntry.getValue();
        }
        System.out.println(stringBuilder);
        System.out.println("Total price is " + sum);
    }

    static void showProducts(Basket basket, String sortMethod) {
        // sortMethod can be "namePrice", "name", "price"
        System.out.println("sortMethod: " + sortMethod);
        List<Product> list = new ArrayList<>(basket.basket.keySet());
        switch (sortMethod) {
            case "namePrice":
                TreeMap<Product, Integer> treeMap = new TreeMap<>(basket.basket);
                for (Entry<Product, Integer> entry : treeMap.entrySet()) {
                    System.out.print(entry.getKey() + " " + entry.getValue());
                }
                System.out.println();
                break;
            case "name":
                Comparator<Product> nameComparator = new ProductNameComparator();
                list.sort(nameComparator);
                for (Product product : list) {
                    System.out.print(product + " " + basket.basket.get(product));
                }
                System.out.println();
                break;
            case "price":
                Comparator<Product> priceComparator = new ProductPriceComparator();
                list.sort(priceComparator);
                for (Product product : list) {
                    System.out.print(product + " " + basket.basket.get(product));
                }
                System.out.println();
                break;
            default:
                System.out.println("No such sortMethod");
                break;
        }
    }

    public static void main(String[] args) {
        Product product5 = new Product("product5", 5);

        Basket basket = new Basket();
        basket.basket.put(new Product("product1", 1), 1);
        basket.basket.put(new Product("product1", 2), 1);
        basket.basket.put(new Product("product111", 3), 1);
        basket.basket.put(new Product("product2", 2), 2);
        basket.basket.put(new Product("product3", 3), 3);
        basket.basket.put(new Product("product4", 4), 4);
//        basket.basket.put(product5, 5);

        showProducts(basket, "name");
        addProduct(product5, 5, basket);
        showProducts(basket, "namePrice");
        showProducts(basket, "price");
        addProduct(product5, 5, basket);
        showProducts(basket, "namePrice");
        getCheck(basket);

    }
}
