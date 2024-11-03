package Module3.OOP;

public class Homework2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.grant = 100;
        person.salary = 1000;
        System.out.println(person.getIncome());
    }
}

abstract class User {
    String name;

    abstract protected int getIncome();
}

class Student extends User {
    int grant;

    @Override
    protected int getIncome() {
        return grant;
    }
}

class Person extends Student {
    int salary;

    @Override
    protected int getIncome() {
        return super.getIncome() + salary;
    }
}