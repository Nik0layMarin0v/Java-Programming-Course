package textProcessing.exercise;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char newLetter = (char) (text.charAt(i) + 3);
            encryptedText.append(newLetter);
        }

        System.out.println(encryptedText);
    }
}
