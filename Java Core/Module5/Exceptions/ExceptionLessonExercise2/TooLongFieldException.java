package Module5.Exceptions.ExceptionLessonExercise2;

public class TooLongFieldException extends NoRegisterException {
    String message;
    String fieldContains;

    public TooLongFieldException(String message, String fieldContains) {
        super(message);
        this.message = message;
        this.fieldContains = fieldContains;
    }
}
