package Module3;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println("Введите пароль");
        Scanner scanner = new Scanner(System.in);
        String newPassword = scanner.nextLine();
        System.out.println(passwordValidation(newPassword));
    }

    public static String passwordValidation(String newPassword) {
        String password[] = {"1234qwer", "12345qwert", "1234QWER", "1234QWer"};
        String validationResult = "Security password validation success";
        for (int i = 0; i < password.length; i++) {
            if (newPassword.equals(password[i])) {
                validationResult = "Password was use before";
            }
            if (newPassword.length() < 8) {
                validationResult = "Password is small";
            }
        }
        return validationResult;
    }
}

