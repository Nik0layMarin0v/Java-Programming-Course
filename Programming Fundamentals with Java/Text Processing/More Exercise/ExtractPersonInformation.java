package textProcessing.moreExercise;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            String input = scanner.nextLine();
            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.charAt(j);
                if (currentChar == '@') {
                    for (int k = j + 1; k < input.length(); k++) {
                        if (input.charAt(k) != '|') {
                            name.append(input.charAt(k));
                        } else {
                            j = k;
                            break;
                        }
                    }
                }
                if (currentChar == '#') {
                    for (int k = j + 1; k < input.length(); k++) {
                        if (input.charAt(k) != '*') {
                            age.append(input.charAt(k));
                        } else {
                            j = k;
                            break;
                        }
                    }
                }
            }
            System.out.printf("%s is %s years old.%n", name, age);
        }
    }
}
