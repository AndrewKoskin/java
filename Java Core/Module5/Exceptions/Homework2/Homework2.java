package Module5.Exceptions.Homework2;

public class Homework2 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is my exception. There are many. This is mine.");
        } catch (MyException e ){
            System.out.println(e.message);
        }finally {
            System.out.println("Hope MyException got caught!");
        }
    }
}
