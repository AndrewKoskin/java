package Module2.Regexp.Regexp;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class Train {
    String destination;
    int number;
    LocalTime time;

    public Train(String destination, int number, LocalTime time) {
        this.destination = destination;
        this.number = number;
        this.time = time;
    }

    public static void sortNumbers(Train[] trains) {
        int[] numbers = new int[trains.length];
        // Записываем списком номера поездов
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = trains[i].number;
        }
        System.out.println(Arrays.toString(numbers));
        int current;
        for (int i = 1; i < numbers.length; i++) {
            current = numbers[i];
            if (current < numbers[i - 1]) {
                int j = i - 1;
                while (j >= 0 && current < numbers[j]) {
                    numbers[j + 1] = numbers[j];
                    j--;
                }
                numbers[j + 1] = current;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void getTrainInfo(Train[] trains, int number) {
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].number == number) {
                System.out.println("Train with number " + number + " has destination in " + trains[i].destination + " and time " + trains[i].time);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Train[] trains = new Train[5];
        String[] cities = {"Moscow", "St. Petersburg", "Astrakhan", "Rostov", "Vladivostok"};
        LocalTime[] times = new LocalTime[5];
        for (int i = 0; i < 5; i++) {
            times[i] = LocalTime.of(random.nextInt(12), random.nextInt(60));

        }
        int lastTrainNumber = 0;
        for (int i = 0; i < 5; i++) {
            lastTrainNumber = random.nextInt(100000);
            trains[i] = new Train(cities[random.nextInt(5)], lastTrainNumber, times[random.nextInt(5)]);
        }
        Train.sortNumbers(trains);
        Train.getTrainInfo(trains, lastTrainNumber);
    }
}
