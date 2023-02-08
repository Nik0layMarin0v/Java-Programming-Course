package textProcessing.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");

        List<String> multipliedResult = new ArrayList<>();
        for (int i = 0; i < inputArr.length; i++) {

            for (int j = 0; j < inputArr[i].length(); j++) {
                multipliedResult.add(inputArr[i]);
            }

        }
        System.out.println(String.join("", multipliedResult));
    }
}
