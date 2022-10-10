package methods.exercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(getMiddleChar(text));
    }

    public static String getMiddleChar(String text){
        if (text.length() % 2 == 0) {
            String middleChars = text.charAt(text.length() / 2 - 1) + "" + text.charAt(text.length() / 2);
            return middleChars;
        } else {
            String middleChars = "" + text.charAt(text.length() / 2);
            return middleChars;
        }
    }
}
