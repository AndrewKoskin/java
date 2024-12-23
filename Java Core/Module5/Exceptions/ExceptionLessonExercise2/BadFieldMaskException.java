package Module5.Exceptions.ExceptionLessonExercise2;

public class BadFieldMaskException extends NoRegisterException {
    String message;
    String fieldContains;

    public BadFieldMaskException(String message, String fieldContains) {
        super(message);
        this.message = message;
        this.fieldContains = fieldContains;
    }
}
