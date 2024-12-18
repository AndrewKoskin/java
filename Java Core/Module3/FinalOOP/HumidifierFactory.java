package Module3.FinalOOP;

public class HumidifierFactory extends HouseChangerFactory{
    @Override
    public HouseChanger createHouseChanger() {
        return new Humidifier();
    }
}
