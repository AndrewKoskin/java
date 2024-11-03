package Module3.OOP;

public class Homework1 {
    public static void main(String[] args) {
        FactoryWorker factoryWorker = new FactoryWorker("Andrew", 24, 200_000);
        factoryWorker.sayMeow();
        factoryWorker.sayMeow(4);
        System.out.println(factoryWorker.getFactoryAddress());
        System.out.println(factoryWorker.getEmployeeGreet());
        System.out.println(factoryWorker);
    }
}

interface FactoryEmployeeInterface {
    final String employeeGreet = "Hi, i am employee";
    static final String factoryAddress = "Noril'sk, Nadezda";

    String getEmployeeGreet();

    String getFactoryAddress();
}

abstract class FactoryEmployeeAbstract implements FactoryEmployeeInterface {
    String employeeName;
    int employeeAge;

    public void sayMeow() {
        System.out.println("Meow");
    }

    abstract public void sayMeow(int x);

    @Override
    public String getEmployeeGreet() {
        return FactoryEmployeeInterface.employeeGreet;
    }

    @Override
    public String getFactoryAddress() {
        return FactoryEmployeeInterface.factoryAddress;
    }
}

class FactoryWorker extends FactoryEmployeeAbstract {
    int employeeSalary;


    public FactoryWorker(String employeeName, int employeeAge, int employeeSalary) {
        this.employeeSalary = employeeSalary;
        this.employeeAge = employeeAge;
        this.employeeName = employeeName;
    }

    public String getEmployeeGreet() {
        return super.getEmployeeGreet() + ", and my name is " + this.employeeName;
    }

    public String toString() {
        return "FactoryWorker: " + this.employeeName + ", " + this.employeeSalary;
    }

    @Override
    public void sayMeow(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("Meow");
        }
    }
}