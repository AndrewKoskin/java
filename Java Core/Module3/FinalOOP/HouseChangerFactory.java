package Module3.FinalOOP;

public abstract class HouseChangerFactory {
    public abstract HouseChanger createHouseChanger();
    public void execute(int value, House house){
        HouseChanger houseChanger = createHouseChanger();
        houseChanger.execute(value, house);

    }
}
