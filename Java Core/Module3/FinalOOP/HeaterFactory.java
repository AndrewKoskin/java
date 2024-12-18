package Module3.FinalOOP;

public class HeaterFactory extends HouseChangerFactory{
    @Override
    public HouseChanger createHouseChanger() {
        return new Heater();
    }
}
