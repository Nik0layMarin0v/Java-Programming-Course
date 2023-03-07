package textProcessing.moreExercise;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morseCode = {".-",   "-...", "-.-.", "-..",  ".",
                "..-.", "--.",  "....", "..",   ".---",
                "-.-",  ".-..", "--",   "-.",   "---",
                ".--.", "--.-", ".-.",  "...",  "-",
                "..-",  "...-", ".--",  "-..-", "-.--",
                "--.."};

        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F',
                'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
                'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z'};

        String[] words = scanner.nextLine().split(" \\| ");
        for (int i = 0; i < words.length; i++) {
            String[] symbols = words[i].split(" ");
            for (int j = 0; j < symbols.length; j++) {
                String currentSymbol = symbols[j];
                for (int k = 0; k < morseCode.length; k++) {
                    if (currentSymbol.equals(morseCode[k])) {
                        System.out.print(letters[k]);
                    }
                }
            }
            System.out.print(" ");
        }
    }
}
