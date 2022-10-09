package methods.exercise;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstChar = scanner.nextLine().charAt(0);
        char secondChar = scanner.nextLine().charAt(0);
        char copy = firstChar;
        if (firstChar > secondChar) {
            firstChar = secondChar;
            secondChar = copy;
        }
        charsBetween(firstChar,secondChar);
    }
    public static void charsBetween(char a, char b) {
        String text = "";
        for (char i = a; i < b; i++) {
            if ( i == a) {
                continue;
            }
            char currentChar = i;
            text = text + currentChar + " ";
        }
        System.out.println(text);
    }
}
