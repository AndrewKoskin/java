package Module5.FinalHomework.test;

import Module5.FinalHomework.main.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import javax.swing.text.DateFormatter;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    PhoneBookImp pbi;

    @BeforeEach
    void createPhoneBookImp() {
        pbi = new PhoneBookImp();
    }

    @Test
    public void addUserTest() {
        pbi.addUser("Andrew", 1, LocalDate.now());
        assertThrows(ContactException.class, () -> {
            pbi.addUser("Andrew", 1, LocalDate.now());
        });
    }

    @Test
    public void getNumberByNameTest() {
        pbi.addUser("Andrew", 1, LocalDate.now());
        assertEquals(1, pbi.getNumberByName("Andrew"));
    }

    @Test
    public void getNameByNumberTest() {
        pbi.addUser("Andrew", 1, LocalDate.now());
        assertEquals("Andrew", pbi.getNameByNumber(1));
    }

    @Test
    public void storeToFileTest() {
        pbi.addUser("Andrew", 1, LocalDate.now());
        // Файл только на чтение, ожидаем ошибку FNF
        assertThrows(FileNotFoundException.class, () -> {
            pbi.storeToFile(new File("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\FinalHomework\\phonebook.txt"));
        });
    }

    @Test
    public void loadFromFileTest() throws IOException {
        pbi.addUser("Andrew", 1, LocalDate.now());
        pbi.storeToFile(new File("meow.txt"));
        assertEquals("Andrew, 1, " + LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyy")), pbi.loadFromFile(new File("meow.txt")));
    }
}
