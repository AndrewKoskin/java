package Module4.FinalTask;

public class Product implements Comparable<Product>{
    String name;
    Integer price;

    public Product(String name, int price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public int compareTo(Product o) {
        int result = this.name.compareTo(o.name);
        if (result == 0){
            return this.price.compareTo(o.price);
        }
        return result;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
