package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String password = "";
        for (int i = 0; i < username.length(); i++) {

            password = username.charAt(i) + password;
        }
        int counter = 0;
        String input = scanner.nextLine();
        while (!input.equals(password)) {
            counter++;
            if (counter == 4) {
                break;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        if (password.equals(input)) {
            System.out.printf("User %s logged in.", username);
        } else {
            System.out.printf("User %s blocked!", username);
        }
    }
}
