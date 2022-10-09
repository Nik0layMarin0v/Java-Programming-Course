package methods.exercise;

import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(getVowels(text));
    }
    public static int getVowels(String text) {
        int counter = 0;
        text = text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++) {
            switch (text.charAt(i)) {
                case 'a':
                case 'o':
                case 'e':
                case 'i':
                case 'u':
                    counter++;
            }
        }
        return counter;
    }
}
