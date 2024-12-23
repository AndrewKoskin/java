package Module5.Exceptions.ExceptionLessonExercise2;

public class FieldNotFilledException extends NoRegisterException{
    String message;
    String field;

    FieldNotFilledException(String message, String field){
        super(message);
        this.message = message;
        this.field = field;
    }
}
