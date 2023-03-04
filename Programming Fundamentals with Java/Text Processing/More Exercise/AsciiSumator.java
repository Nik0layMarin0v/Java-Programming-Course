package textProcessing.moreExercise;

import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char startingChar = scanner.nextLine().charAt(0);
        char endingChar = scanner.nextLine().charAt(0);
        String randomText = scanner.nextLine();

        int sum = 0;
        for (int i = 0; i < randomText.length(); i++) {
            char currentChar = randomText.charAt(i);
            if (currentChar > startingChar && currentChar < endingChar) {
                sum += currentChar;
            }
        }

        System.out.println(sum);
    }
}
