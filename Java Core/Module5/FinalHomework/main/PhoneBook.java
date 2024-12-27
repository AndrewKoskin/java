package Module5.FinalHomework.main;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public interface PhoneBook {
    void addUser(String name, int number, LocalDate createdDate);
    int getNumberByName(String name);
    String getNameByNumber(int number);
    void storeToFile(File phoneBookFile) throws IOException;
    String loadFromFile(File phoneBookFile) throws IOException;
}