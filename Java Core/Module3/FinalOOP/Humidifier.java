package Module3.FinalOOP;

public class Humidifier implements HouseChanger{
    @Override
    public void execute(int value, House house) {
        house.humidity += value;
    }
}
