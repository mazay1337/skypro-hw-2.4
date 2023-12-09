package skyprocourse2.exeptions;

class Validator {
    public static void validate(String login, String password, String confirmPassword) throws ValidationException {
        if (!stringCorrect(login)) {
            throw new ValidationException("Некорректный логин");
        }
        if (!stringCorrect(password)) {
            throw new ValidationException("Некорректный пароль");
        }
        if (!password.equals(confirmPassword)) {
            throw new ValidationException("Пароли не совпадают");
        }
    }

    private static boolean stringCorrect(String checkString) {
        if (checkString == null || checkString.isBlank() || checkString.length() > 20) {
            return false;
        }
        return checkString.matches("[a-zA-Z0-9_]*");
    }
}