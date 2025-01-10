package Module8.Reflection.Lesson;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class User<Integer> implements Comparable<Integer>{
    private String name;
    private int age;



    @Deprecated
    public void meow(){
        System.out.println("meow");
    }



    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        User user = new User("meow", 12);
        Class<User> userClass = User.class;
        System.out.println(userClass);
        System.out.println(userClass.getSuperclass());
        System.out.println(userClass.getName());
        System.out.println(userClass.descriptorString());
        System.out.println(Arrays.toString(userClass.getAnnotatedInterfaces()));
        System.out.println(Arrays.toString(userClass.getAnnotations()));
        System.out.println(Arrays.toString(userClass.getDeclaredAnnotations()));

        Field f = userClass.getDeclaredField("name");
        System.out.println(f.get(user));

        Method method = userClass.getDeclaredMethod("meow");
        System.out.println(method.getName());
        System.out.println(Arrays.toString(method.getDeclaredAnnotations()));

        int modifier = userClass.getModifiers();
        System.out.println(Modifier.isPublic(modifier));

        method.invoke(user);
    }
}
