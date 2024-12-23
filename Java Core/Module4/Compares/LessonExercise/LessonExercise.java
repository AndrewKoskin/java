package Module4.Compares.LessonExercise;

import java.util.Set;
import java.util.TreeSet;

public class LessonExercise {
    public static void main(String[] args) {
        UserNameComparator userNameComparator = new UserNameComparator();
        UserAgeComparator userAgeComparator = new UserAgeComparator();

        User user1 = new User("Andrew", 25);
        User user2 = new User("Dmitry", 24);
        User user3 = new User("Dmitry", 20);
        Set<User> userSet = new TreeSet<>();
        Set<User> userSet1 = new TreeSet<>(userNameComparator);
        Set<User> userSet2 = new TreeSet<>(userAgeComparator);
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet1.add(user1);
        userSet1.add(user2);
        userSet2.add(user1);
        userSet2.add(user2);
        System.out.println(userSet);
        System.out.println(userSet1);
        System.out.println(userSet2);
    }
}
