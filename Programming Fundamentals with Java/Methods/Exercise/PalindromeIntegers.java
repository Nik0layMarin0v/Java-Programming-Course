package methods.exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            if (palindromeOrNot(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    public static boolean palindromeOrNot(String num) {
        boolean valid = false;
        for (int i = 0; i < num.length() / 2; i++) {
            if (num.charAt(i) == num.charAt(num.length() - i - 1)) {
                valid = true;
            } else {
                valid = false;
                break;
            }
        }
        return valid;
    }
}
