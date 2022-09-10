package dataTypesAndVariables.lab;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        for (int i = 0; i < 3; i++) {
            char letter = scanner.nextLine().charAt(0);
            result = letter + " " + result;
        }
        System.out.println(result);
    }
}
