package Module2.ClassesAndObjects.ClassesAndObjects;

public class Homework3 {
    /**
     * Создать класс Clock (Часы)
     * Задать поля alarmHours, alarmMinutes - время когда должен зазвонить будильник
     * Создать метод для установки будильника public String setAlarm(int hours, int minutes)
     * Метод проверяет на допустимость часы и минуты и в случае валидности устанавливает поля будильника.
     * Создать метод для проверки надо ли звонить сейчас public String checkAlarm(int hours, int minutes)
     * если входные параметры hours и minutes совпадают с временем установленным в поля alarmHours, alarmMinutes, то метод возвращает “Chime” (звонок) либо “” (пустую строку) если будильник не сработал.
     * Часы должны звонить в 00 минут столько раз сколько часов, а также каждые 15 минут. Написать метод public int checkTimeCount(int hours, int minutes).
     * Метод возвращает число сколько раз надо часам пробить. Например:
     * 17:15 вернуть 1 (звонить 1 раз),
     * 17:00 вернуть 5 (звонить 5 раз),
     * 17:01 вернуть 0 (не надо звонить)
     * Создать экземпляр часов, сделать проверки методов setAlarm, checkAlarm и checkTimeCount
     */
    public static void main(String[] args) {
        Clock clock = new Clock(12, 15);
        System.out.println(clock.checkAlarm(12, 15));
        System.out.println(clock.checkTimeCount(12, 0));
        clock.setAlarm(12, 0);
    }
}

class Clock {
    int alarmHours;
    int alarmMinutes;

    public Clock(int alarmHours, int alarmMinutes) {
        this.alarmHours = alarmHours;
        this.alarmMinutes = alarmMinutes;
    }

    public void setAlarm(int hours, int minutes) {
        this.alarmHours = hours;
        this.alarmMinutes = minutes;
    }

    public String checkAlarm(int hours, int minutes) {
        if (this.alarmHours == hours && this.alarmMinutes == minutes) {
            return "Chime";
        } else {
            return "";
        }
    }

    public int checkTimeCount(int hours, int minutes) {
        if (minutes == 0) {
            if (hours > 12) {
                return hours % 12;
            } else {
                return hours;
            }
        }
        if (minutes % 15 == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
