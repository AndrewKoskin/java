package Module5.Exceptions.Homework5;

public class NotInRangeException extends RuntimeException {
    String message;
    public NotInRangeException(String message) {
        super(message);
        this.message = message;
        System.out.println("Your number must be in [0;100]");
    }
}
