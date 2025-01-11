package Module8.Annotation.Homework3;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class Cat {
    void eat(){
        System.out.println("Cat eats");
    }
    void sleep(int hours){
        System.out.printf("Cat sleeps %d hours", hours);
    }

    @Override
    public String toString() {
        return "This is a cat!";
    }


    Cat catCreator() throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<Cat> cat = Cat.class;
        return cat.getDeclaredConstructor().newInstance();
    }

    void catLife() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        int hours = new Random().nextInt(10);
        Cat cat = new Cat().catCreator();
        System.out.println(cat);
        cat.eat();
        cat.sleep(hours);
    }

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        new Cat().catLife();
    }
}
