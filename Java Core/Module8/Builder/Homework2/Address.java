package Module8.Builder.Homework2;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String country;
    private String city;
    private String street;
    private Integer houseNumber;

    Address() {
    }

    public static void main(String[] args) {
        Address a = new Address("a", "b", "c", 0);
        Address a1 = new Address();
        System.out.println(a1.equals(a1));
        System.out.println(a);
        System.out.println(a1);
    }
}

