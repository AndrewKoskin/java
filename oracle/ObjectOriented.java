interface Vehicle {
    void changeSpeed(int newValue);

    void changeGear(int newValue);

    void changeFreeSeats(int newValue);

    void printStates();
}

class Bicycle implements Vehicle {
    int speed = 0;
    int gear = 0;
    int free_seats = 0;

    public void changeSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void changeFreeSeats(int newFreeSeats) {
        free_seats = newFreeSeats;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear + " Free seats: " + free_seats);
    }
}

class Car implements Vehicle {
    int speed = 0;
    int gear = 0;
    int free_seats = 0;

    public void changeSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void changeFreeSeats(int newFreeSeats) {
        free_seats = newFreeSeats;
    }

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear + " Free seats: " + free_seats);
    }
}

class RasingCar extends Car {
    int max_speed = 300; // on a straight road

    public void printStates() {
        System.out.println("Speed: " + speed + " Gear: " + gear + " Free seats: " + free_seats + " Max Speed: " + max_speed);
    }
}

class Asdf {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.printStates();
        car2.printStates();

        car1.changeFreeSeats(20); // looks like a bus
        car2.changeFreeSeats(3); // looks like a sedan

        car1.changeGear(2); // starting
        car2.changeGear(5); // going fast

        car1.changeSpeed(20); // km/h
        car2.changeSpeed(130); // make sure road is empty

        car1.printStates();
        car2.printStates();

        RasingCar rasing_car = new RasingCar();
        rasing_car.printStates();

        Bicycle bicycle = new Bicycle();

        bicycle.printStates();

    }
}