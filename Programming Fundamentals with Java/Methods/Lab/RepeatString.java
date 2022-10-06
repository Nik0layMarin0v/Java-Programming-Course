package methods.lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int repetitions = Integer.parseInt(scanner.nextLine());
        String finalText = stringRepetition(text, repetitions);
        System.out.println(finalText);
    }

    public static String stringRepetition(String line, int n) {
        String newLine = "";
        for (int i = 0; i < n; i++) {
            newLine += line;
        }
        return newLine;
    }
}
