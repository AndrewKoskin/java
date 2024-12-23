package Module4;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.DoubleStream;

public class Manager {
    static Map<String, User> userMap = new HashMap<>();

    static boolean login(String login, String password) {
        if (!userMap.containsKey(login)) {
            System.out.println("No such user!");
            return false;
        } else if (userMap.get(login).password != password) {
            System.out.println("Bad password!");
            return false;
        } else {
            System.out.println("You are welcome!");
            return true;
        }
    }

    static boolean addNewUser(User user) {
        if (userMap.containsKey(user.login)) {
            System.out.println("User with this login already exists!");
            return false;
        } else {
            System.out.println("User with login " + user.login + " added!");
            userMap.put(user.login, user);
            return true;
        }
    }

    static boolean deleteUser(String login) {
        if (userMap.containsKey(login)) {
            userMap.remove(login);
            System.out.println("User with login " + login + " deleted!");
            return true;
        } else {
            System.out.println("User with this login do not exist!");
            return false;
        }
    }

    Map<String, User> getAllUsers() {
        return userMap;
    }

    static Map<String, User> getAllUsers(String sortCriterion) { // sortCriterion can be either login or date

        Comparator<Map.Entry<String, User>> byLogin = Comparator.comparing(entry -> entry.getValue().login);
        Comparator<Map.Entry<String, User>> byDate = Comparator.comparing(entry -> entry.getValue().createdDate);
        List<Map.Entry<String, User>> sortedList = new ArrayList<>();
        for (Map.Entry<String, User> elem: userMap.entrySet()){
            sortedList.add(elem);
        }

        if (sortCriterion == "login") {
            sortedList.sort(byLogin);
        } else if (sortCriterion == "date") {
            sortedList.sort(byDate);
        }
        System.out.println(sortedList);
        return userMap;
    }
    static boolean editUser(User user){
        if (userMap.containsKey(user.login)){
            userMap.put(user.login, user);
            System.out.println("User with login " + user.login + " edited!");
            return true;
        }
        else{
            System.out.println("No such user!");
            return false;
        }
    }

    public static void main(String[] args) {
        User user1 = new User("Meow1", "Meow1", LocalDate.of(4,1,1));
        User user2 = new User("Meow2", "Meow2", LocalDate.of(3,1,1));
        User user3 = new User("Meow3", "Meow3", LocalDate.of(2,1,1));
        User user4 = new User("Meow4", "Meow4", LocalDate.of(1,1,1));
        userMap.put(user3.login, user3);
        userMap.put(user2.login, user2);
        userMap.put(user4.login, user4);
        userMap.put(user1.login, user1);
        getAllUsers("login");
        getAllUsers("date");
        deleteUser("Meow1");
        System.out.println(userMap);
        user3.password = "USER3";
        editUser(user3);
        System.out.println(userMap);
        login("Meow2", "Meow2");
    }

}
