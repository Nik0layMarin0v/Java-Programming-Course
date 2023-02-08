package textProcessing.lab;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removalWord = scanner.nextLine();
        String mainWord = scanner.nextLine();

        while (mainWord.contains(removalWord)) {
            mainWord = mainWord.replace(removalWord, "");
        }
        System.out.println(mainWord);
    }
}
