package dataTypesAndVariables.moreExercise;

import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        boolean opening = false;
        boolean balanced = true;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if (input.contains("(") && opening == false) {
                opening = true;
            } else if (input.contains(")") && opening == true) {
                opening = false;
            } else if (input.contains("(") || input.contains(")")) {
                balanced = false;
                break;
            }
        }

        if (opening) {
            balanced = false;
        }
        if (balanced) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
