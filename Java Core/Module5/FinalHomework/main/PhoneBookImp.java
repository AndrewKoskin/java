package Module5.FinalHomework.main;


import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class PhoneBookImp implements PhoneBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    HashSet<String> names = new HashSet<>();
    HashSet<Integer> numbers = new HashSet<>();

    public PhoneBookImp() {
        names = new HashSet<>();
    }

    public void addUser(String name, int number, LocalDate createdDate) {
        if (names.contains(name)) {
            throw new ContactNameException("This contact name already in phone book!");
        } else if (numbers.contains(number)) {
            throw new ContactNumberException("This contact number already in phone book!");
        } else {
            contacts.add(new Contact(name, number, createdDate));
            names.add(name);
            numbers.add(number);
        }

    }

    public int getNumberByName(String name) {
        if (names.contains(name)) {
            for (Contact c : contacts) {
                if (c.getName().equals(name)) {
                    return c.getNumber();
                }
            }
        }
        return -1;
    }

    public String getNameByNumber(int number) {
        if (numbers.contains(number)) {
            for (Contact c : contacts) {
                if (c.getNumber() == number) {
                    return c.getName();
                }
            }
        }
        return "-1";
    }

    public void storeToFile(File phoneBookFile) throws IOException{
        try (FileWriter fw = new FileWriter(phoneBookFile)) {
            if (!phoneBookFile.exists()) {
                phoneBookFile.createNewFile();
                System.out.println("File " + phoneBookFile.getName() + " created!");
            } else {
                System.out.println("File " + phoneBookFile.getName() + " is already existing.");
            }
            for (Contact c : contacts) {
                fw.write(c.getName() + ", " + c.getNumber() + ", " + c.getCreatedDate().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")) + '\n');
            }
        } catch (WriteAbortedException e){
            System.out.println("Existing file cannot be overwritten!");
            throw new WriteAbortedException("", e);
        } catch (UnsupportedEncodingException e){
            System.out.println("Unsupported encoding.");
            throw new UnsupportedEncodingException();
        } catch (FileNotFoundException e ){
            System.out.println("Write access is denied");
            throw new FileNotFoundException();
        } catch (IOException e){
            System.out.println("IOE got here, idk what you did.");
            throw new IOException();
        }
    }

    public String loadFromFile(File phoneBookFile) {
        String result = "";
        String nl;
        try {
            Scanner sc = new Scanner(phoneBookFile);
            while (sc.hasNext()) {
                nl = sc.nextLine();
                System.out.println(nl);
                result += nl;
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("FNF, you typed file that not existing.");
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        PhoneBook phoneBook = new PhoneBookImp();
        phoneBook.addUser("Ivan", 123, LocalDate.now());
        phoneBook.addUser("Petr", 345, LocalDate.now());
        phoneBook.storeToFile(new File("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\FinalHomework\\phonebook.txt"));
        PhoneBook phoneBook2 = new PhoneBookImp();
        phoneBook2.loadFromFile(new File("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\FinalHomework\\phonebook.txt"));
        System.out.println(phoneBook.getNameByNumber(123).equals("Ivan"));
        System.out.println((phoneBook.getNumberByName("Petr") == 345));
    }
}
