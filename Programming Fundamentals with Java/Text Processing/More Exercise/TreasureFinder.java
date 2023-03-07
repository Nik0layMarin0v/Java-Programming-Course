package textProcessing.moreExercise;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] keys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("find")) {
            StringBuilder message = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if (i >= keys.length) {
                    currentChar = (char) ((int)currentChar - (keys[i % keys.length]));
                } else {
                    currentChar = (char) ((int)currentChar - (keys[i]));
                }
                message.append(currentChar);
            }

            StringBuilder type = new StringBuilder();
            StringBuilder coordinates = new StringBuilder();

            for (int j = 0; j < message.length(); j++) {
                char currentChar = message.charAt(j);
                if (currentChar == '&') {
                    for (int k = j + 1; k < input.length(); k++) {
                        if (message.charAt(k) != '&') {
                            type.append(message.charAt(k));
                        } else {
                            j = k;
                            break;
                        }
                    }
                }
                if (currentChar == '<') {
                    for (int k = j + 1; k < message.length(); k++) {
                        if (message.charAt(k) != '>') {
                            coordinates.append(message.charAt(k));
                        } else {
                            j = k;
                            break;
                        }
                    }
                }
            }
            System.out.printf("Found %s at %s%n", type, coordinates);
            input = scanner.nextLine();
        }

    }
}
