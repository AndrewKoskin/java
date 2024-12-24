package Module5.Exceptions.Homework3;

public class Homework3 {
    static void exceptioner(){
        throw new StackOverflowError("Stack really is not overflowed, do not worry.");
    }

    public static void main(String[] args) {
        try{
            exceptioner();
        }catch (StackOverflowError e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Hope SOE got caught!");
        }
    }
}
