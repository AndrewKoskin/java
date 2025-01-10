package Module8.Builder.Homework1;
import Module8.Builder.Homework2.Address;
import Module8.Builder.Homework2.BirthInfo;

import lombok.Getter;
import lombok.AccessLevel;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Getter(AccessLevel.PRIVATE)
public class Person {
    final String name;
    final String surname;
    final BirthInfo birthInfo;
    Address address;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthInfo=" + birthInfo +
                ", address='" + address + '\'' +
                '}';
    }

    public Person(Steps steps) {
        this.name = steps.name;
        this.surname = steps.surname;
        this.birthInfo = steps.birthInfo;
        this.address = steps.address;
    }


    public static void main(String[] args) {
        Person p = new PersonBuilder().newBuilder().withName("Andrew").withSurname("Koskin").withBirthYear(new BirthInfo(LocalDate.of(1,1,1), LocalTime.of(1,1), "NSK", 1d, 1d)).withAddress(new Address("a", "b", "c", 0)).build();
        System.out.println(p);
        System.out.println(p.getAddress());;
        try {
            new PersonBuilder().newBuilder().build();
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }

    }
}

class PersonBuilder{
    String name;
    String surname;
    BirthInfo birthInfo;
    Address address;

    Steps newBuilder(){
        return new Steps();
    }
}

class Steps implements NameStep, SurnameStep, BirthYearStep, AddressStep, BuildStep {
    String name;
    String surname;
    BirthInfo birthInfo;
    Address address;


    public SurnameStep withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public BirthYearStep withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    @Override
    public AddressStep withBirthYear(BirthInfo birthInfo) {
        this.birthInfo = birthInfo;
        return this;
    }

    @Override
    public BuildStep withAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (Objects.isNull(name))
            throw new IllegalStateException("Name is null");
        return new Person(this);
    }
}

interface NameStep {
    SurnameStep withName(String name);
}
interface SurnameStep {
    BirthYearStep withSurname(String surname);
}

interface BirthYearStep {
    AddressStep withBirthYear(BirthInfo birthInfo);
}

interface AddressStep {
    BuildStep withAddress(Address address);
}

interface BuildStep {
    Person build();
}
