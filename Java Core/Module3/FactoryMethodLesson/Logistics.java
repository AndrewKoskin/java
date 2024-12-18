package Module3.FactoryMethodLesson;

public abstract class Logistics {
    public abstract Transport createTransport();
    public void doLogistics(){
        Transport transport = createTransport();
        transport.deliver();
    }
}
