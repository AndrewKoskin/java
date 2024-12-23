package Module5.Exceptions.ExceptionLessonExercise2;

public class NoRegisterException extends Exception {
    String message;

    NoRegisterException(String message){
        super(message);
        this.message = message;
    }
}
