package Module4.Compares.LessonExercise;

public class User implements Comparable<User>{
    String name;
    Integer age;

    User(String name, Integer age){
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(User u) {
        int compareResult = name.compareTo(u.name);
        if (compareResult == 0){
            return age.compareTo(u.age);
        }
        return compareResult;
    }
}

