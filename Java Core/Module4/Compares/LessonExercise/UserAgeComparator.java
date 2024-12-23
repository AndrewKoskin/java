package Module4.Compares.LessonExercise;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return -u1.age.compareTo(u2.age);
    }
}
