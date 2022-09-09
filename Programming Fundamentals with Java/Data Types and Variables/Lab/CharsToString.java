package dataTypesAndVariables.lab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        String result = "";
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            char letter = scanner.nextLine().charAt(0);
            result += letter;
        }
        System.out.println(result);
    }
}
