package Module3.Generics;

public class Homework0 {
}

class A {
    public static final int a = 1;
}

class B extends A {
    public static final int b = 1;
}

class C extends A {
    public static final int c = 1;
}

class Gen<T> {
    T obj;


    public static void setA(Gen<? extends A> child) {
        // Принимает А и его потомков
        System.out.println("setA");
    }

    public static void setB(Gen<? super B> child) {
        // Принимает только б и его родителей
        System.out.println("setB");
    }

    public static void main(String[] args) {
        Gen<A> genA = new Gen<>();
        Gen<B> genB = new Gen<>();
        Gen<C> genC = new Gen<>();

        setA(genA);
        setB(genB);
        setA(genA);
        setB(genB);
//        setB(genC); Не даст, так как ц - не родитель б
//        setA(Object); Не даст, так как обжект - родитель а
    }
}


