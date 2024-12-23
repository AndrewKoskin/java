package Module5.Exceptions.ExceptionLessonExercise2;

import java.util.Map;

public class ExceptionLessonExercise2 {
    static void validateRegistration(String login, String password, String confirmPassword) throws NoRegisterException {
        Map<String, String> map = Map.of("login", login, "password", password, "confirmPassword", confirmPassword);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            checkEmptyField(entry.getKey(), entry.getValue());
            checkTooLongField(entry.getKey(), entry.getValue());
            checkFieldMask(entry.getKey(), entry.getValue());
        }
        if (!password.equals(confirmPassword)){
            throw new PasswordsNotEqualException("Passwords not equal", password, confirmPassword);
        }
        System.out.print("Login successfully done!");

    }

    static void checkEmptyField(String fieldName, String fieldContains) throws FieldNotFilledException {
        if (fieldContains.isEmpty()) {
            throw new FieldNotFilledException("Field not filled: " + fieldName, fieldContains);
        }
    }


    static void checkTooLongField(String fieldName, String fieldContains) throws TooLongFieldException {
        if (fieldContains.length() > 20) {
            throw new TooLongFieldException("Field too long: " + fieldName, fieldContains);
        }
    }

    static void checkFieldMask(String fieldName, String fieldContains) throws BadFieldMaskException{
        if (!fieldContains.matches("[a-zA-Z0-9_]+")) {
            throw new BadFieldMaskException ("Field does not match mask: " + fieldName, fieldContains);
        }
    }

    public static void main(String[] args) throws NoRegisterException {
        validateRegistration("", "meow", "meow");
        validateRegistration("$", "meow", "meow");
        validateRegistration("meow", "mmeowmeowmeowmeowmeowmeowmeowmeowmeoweow", "meow");
        validateRegistration("Meow", "meow", "Meow");
        validateRegistration("Meow", "meow", "meow");
    }
}
