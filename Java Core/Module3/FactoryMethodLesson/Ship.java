package Module3.FactoryMethodLesson;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Ship is moving");
    }
}
