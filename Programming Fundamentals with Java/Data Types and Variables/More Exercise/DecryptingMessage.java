package dataTypesAndVariables.moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            int currentChar = scanner.nextLine().charAt(0);
            char decryptedChar = (char) (currentChar + key);
            System.out.print(decryptedChar);
        }

    }
}
