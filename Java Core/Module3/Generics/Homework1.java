package Module3.Generics;

public class Homework1 {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = car;
        vehicles[1] = motorcycle;
        Garage<Vehicle> garage = new Garage<>(vehicles);
        motorcycle.name = "NotMotorcycle";
        garage.sayName();
        garage.meow();
    }
}

class Vehicle {
    protected String name;

    public Vehicle() {
        this.name = "Vasya";
    }

    public Vehicle(String name) {
        this.name = name;
    }

    protected void sayName() {
        System.out.println(this.name);
    }
}

class Car extends Vehicle {
    public Car() {
        this.name = "CarVasya";
    }

    public Car(String name) {
        super(name);
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.name = "MotorcycleVasya";
    }

    public Motorcycle(String name) {
        super(name);
    }
}

class Garage<T extends Vehicle> {
    T[] vehicle;

    public Garage(T[] vehicle) {
        this.vehicle = vehicle;
        for (int i = 0; i < vehicle.length; i++) {
            vehicle[i].sayName();
        }
    }
    public void sayName(){
        for (int i = 0; i < vehicle.length; i++) {
            vehicle[i].sayName();
        }

    }
    public void meow(){
        System.out.println("meow");
    }

}