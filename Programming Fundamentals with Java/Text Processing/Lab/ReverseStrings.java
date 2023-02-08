package textProcessing.lab;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!"end".equals(input)) {
            StringBuilder reversed = reversingStr(input);
            System.out.printf("%s = %s%n", input, reversed);
            input = scanner.nextLine();
        }
    }

    public static StringBuilder reversingStr(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed;
    }
}
