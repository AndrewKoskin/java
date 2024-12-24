package Module5.Exceptions.Homework2;

public class MyException extends Exception {
    String message;

    MyException(String message){
        super(message);
        this.message = message;
    }
}
