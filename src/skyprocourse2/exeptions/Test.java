package skyprocourse2.exeptions;

public class Test {
    public static void main(String[] args) {

        String login = "Zaya_Mazaya";
        String password = "sKyPrO_2023";
        String confirmPassword = "sKyPrO_2023";

        try {
            Validator.validate(login, password, confirmPassword);
            System.out.println("Регистрация прошла успешно!");
        } catch (ValidationException e) {
            System.out.println("Ошибка при регистрации: " + e.getMessage());
        }
    }
}

