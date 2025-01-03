package Module7.Lambda.Lesson;

class MyClass{
    int a = 123;
    static int doSomething(int a){return 1;}
    void doSomethingElse(MyInterface myInterface){
        System.out.println(myInterface.meow(1234));
    };
    int meow(int a){
        return a;
    }

    public static void main(String[] args){
        MyClass myClass = new MyClass();
        myClass.doSomethingElse(MyClass::doSomething);
        myClass.doSomethingElse(myClass::meow);

    }
}
//MyClass::doSomething // статический метод
//myClass::doSomethingElse // метод объекта
//MyClass::new  // конструктор класса

@FunctionalInterface
interface MyInterface{
    int meow(int a);
}
