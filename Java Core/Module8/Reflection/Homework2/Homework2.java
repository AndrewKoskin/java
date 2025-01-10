package Module8.Reflection.Homework2;

import java.lang.reflect.InvocationTargetException;

public class Homework2 {
    void printHelloWorld(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Homework2 h2 = new Homework2();
        Class<? extends Homework2> hclass = h2.getClass();
        Class<Homework2> c = Homework2.class;

        hclass.getDeclaredMethod("printHelloWorld").invoke(h2);
    }
}
