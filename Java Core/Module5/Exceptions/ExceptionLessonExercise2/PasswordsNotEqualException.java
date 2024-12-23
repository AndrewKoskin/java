package Module5.Exceptions.ExceptionLessonExercise2;

public class PasswordsNotEqualException extends NoRegisterException{
    String message;
    String password;
    String confirmPassword;

    public PasswordsNotEqualException(String message, String password, String confirmPassword) {
        super(message);
        this.message = message;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }
}
