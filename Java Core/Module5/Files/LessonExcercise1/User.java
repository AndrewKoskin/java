package Module5.Files.LessonExcercise1;

import java.io.*;
import java.util.Objects;

public class User implements Serializable {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public static void main(String[] args) throws IOException {
        User user = new User("Meowth");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\koski\\OneDrive\\Документы\\meow\\meow2.txt"))){
            oos.writeObject(user);
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\koski\\OneDrive\\Документы\\meow\\meow2.txt"))){
            User user1 = (User) ois.readObject();
            System.out.println(user1.getName());
            System.out.println(user.equals(user1));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
