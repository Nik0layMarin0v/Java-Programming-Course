package lists.moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        StringBuilder nonNumbers = new StringBuilder();
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar >= '0' && currentChar <= '9') {
                numbersList.add(Integer.parseInt(String.valueOf(currentChar)));
            } else {
                nonNumbers.append(currentChar);
            }
        }

        StringBuilder message = new StringBuilder();
        for (int i = 0; i < numbersList.size(); i++) {
            int num = numbersList.get(i);
            if (num > nonNumbers.length()) {
                num = nonNumbers.length();
            }


            if (i % 2 == 0) {
                for (int j = 0; j < num; j++) {
                    message.append(nonNumbers.charAt(0));
                    nonNumbers.deleteCharAt(0);
                }
            } else {
                for (int j = 0; j < num; j++) {
                    nonNumbers.deleteCharAt(0);
                }
            }

        }

        System.out.println(message);
    }
}
