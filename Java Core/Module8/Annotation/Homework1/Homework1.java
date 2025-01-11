package Module8.Annotation.Homework1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Homework1 {
    @AcademyInfo(year = 1)
    void method1() {
        System.out.println("Method1");
    }

    void method2() {
        System.out.println("Method2");
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Class<Homework1> c = Homework1.class;
        Method[] methods = c.getDeclaredMethods();
        System.out.println(Arrays.toString(methods));
        for (Method m : methods) {
            if (m.getAnnotation(AcademyInfo.class) != null) {
                System.out.println("Method1 is annotated");
                m.invoke(new Homework1());
            } else {
                if (!m.getName().equals("main")) {
                    System.out.println("Method2 not is annotated");
                    m.invoke(new Homework1());
                } else {
                    System.out.println("main method also has not AcademyInfo and it cannot be invoked with new Homework1");
                }
            }
        }

    }

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface AcademyInfo {
    int year();
}