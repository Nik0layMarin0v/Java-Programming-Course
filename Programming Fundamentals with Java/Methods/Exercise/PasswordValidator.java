package methods.exercise;

import java.util.Locale;
import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (validIntegerCount(password) && validSize(password) && validSymbols(password)) {
            System.out.println("Password is valid");
        }
        if (!validSize(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!validSymbols(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!validIntegerCount(password)) {
            System.out.println("Password must have at least 2 digits");
        }

    }
    public static boolean validSize(String pass) {
        return pass.length() >= 6 && pass.length() <= 10;
    }

    public static boolean validSymbols(String pass) {
        boolean valid = false;
        pass = pass.toLowerCase(Locale.ROOT);
        for (char i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) > 47 && pass.charAt(i) < 58 || pass.charAt(i) > 96 && pass.charAt(i) < 123) {
                valid = true;
            } else {
                valid = false;
                break;
            }
        }
        return valid;
    }

    public static boolean validIntegerCount(String pass) {
        int counter = 0;
        for (char i = 0; i < pass.length(); i++) {
            if (pass.charAt(i) > 47 && pass.charAt(i) < 58) {
                counter++;
            }
        }
        return counter >= 2;
    }
}
