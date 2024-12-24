package Module5.Exceptions.Homework1;

public class Homework1 {
    static void throwNPE(){
        throw new NullPointerException("Homework NPE, try to catch it!");
    }

    public static void main(String[] args) {
        try{
            throwNPE();
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("meow");
        }
    }
}
