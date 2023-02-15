package textProcessing.exercise;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String firstWord = input[0];
        String secondWord = input[1];

        System.out.println(characterMultiplication(firstWord, secondWord));
    }

    public static int characterMultiplication (String first, String second) {
        int sum = 0;
        String longerText = first;
        String shorterText = second;
        if (first.length() <= second.length()) {
            longerText = second;
            shorterText = first;
        }
        for (int i = 0; i < longerText.length(); i++) {
            char bigSymbol = longerText.charAt(i);
            if (i < shorterText.length()) {
                char smallSymbol = shorterText.charAt(i);
                sum += bigSymbol * smallSymbol;
            } else {
                sum += bigSymbol;
            }
        }
        return sum;
    }
}
