package textProcessing.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernamesArray = scanner.nextLine().split(", ");

        List<String> validNames = new ArrayList<>();
        for (String name: usernamesArray) {
            if (validLength(name)) {
                if(validSymbols(name)) {
                    validNames.add(name);
                }
            }
        }

        System.out.println(String.join("\n", validNames));
    }

    public static boolean validLength(String s) {
        if (s.length() >= 3 && s.length() <= 16) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validSymbols(String s) {
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            char currSymbol = s.charAt(i);
            if (!Character.isDigit(currSymbol) && !Character.isLetter(currSymbol) && currSymbol != '-' && currSymbol != '_') {
                isValid = false;
                break;
            }
        }
        return isValid;
    }


}
