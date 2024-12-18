package Module3.FinalOOP;

public class Heater implements HouseChanger{
    @Override
    public void execute(int value, House house) {
        house.temperature += value;
    }
}
