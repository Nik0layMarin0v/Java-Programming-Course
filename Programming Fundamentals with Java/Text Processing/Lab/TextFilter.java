package textProcessing.lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWordsArr.length; i++) {
            text = text.replace(bannedWordsArr[i], asterisksReplacement(bannedWordsArr[i]));
        }
        System.out.println(text);
    }


    public static StringBuilder asterisksReplacement(String s) {
        StringBuilder asterisks = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            asterisks.append("*");
        }
        return asterisks;
    }
}
