package Module5.Files.Homework4;

import Module5.Files.LessonExcercise1.User;

import java.io.*;

public class Homework4 {
    public static void main(String[] args) throws FileNotFoundException {
        User[] users = new User[10];
        for (int i = 0; i < 10; i++) {

            // FileOutputStream вторым аргументом принимает append - решает, будет ли объект добавляться в файл, или перезаписываться с нуля
            // Можно обойти выносом output стримов за тело цикло, чтобы каждый раз не создавался новый стрим. Таким образом файл откроется только один раз, а значит перезаписи не случится
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\Files\\Homework4\\serialize.dat", true))) {
                users[i] = new User("User" + i);
                oos.writeObject(users[i]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\koski\\Documents\\java\\Java Core\\Module5\\Files\\Homework4\\serialize.dat"))) {
            for (int i = 0; i < 10; i++) {
                System.out.println(((User) ois.readObject()));
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
