package Module3.FinalOOP;

public class HouseManager {
    public static HouseChangerFactory houseChangerFactory;

    public static void createHouseChanger(String houseChanger) {
        switch (houseChanger) {
            case "humidifier":
                houseChangerFactory = new HumidifierFactory();
                break;
            case "heater":
                houseChangerFactory = new HeaterFactory();
                break;
            default:
                System.out.println("Shit Happens");
        }
    }

    public static void main(String[] args) {
        House house = new House(12, 50);
        System.out.println("Temperature: " + house.temperature + ", humidity: " + house.humidity + ".");
        createHouseChanger("humidifier");
        houseChangerFactory.execute(12, house);
        System.out.println("Temperature: " + house.temperature + ", humidity: " + house.humidity + ".");
        createHouseChanger("heater");
        houseChangerFactory.execute(12, house);
        System.out.println("Temperature: " + house.temperature + ", humidity: " + house.humidity + ".");

    }
}
