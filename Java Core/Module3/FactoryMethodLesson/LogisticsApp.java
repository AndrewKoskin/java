package Module3.FactoryMethodLesson;

import java.util.Scanner;

public class LogisticsApp {
    public static Logistics logistics;

    private static void configureLogisticsType(String type) {
        switch (type) {
            case "truck":
                logistics = new RoadLogistics();
                break;
            case "ship":
                logistics = new SeaLogistics();
                break;
            default:
                logistics = new RoadLogistics();
                break;

        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.next();
        configureLogisticsType(type);
        doLogistics();
    }

    public static void doLogistics() {
        logistics.doLogistics();
    }
}
