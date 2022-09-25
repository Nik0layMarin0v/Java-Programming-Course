package arrays.moreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortAndPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            numbers[i] = summing(name);
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static int summing(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char currChar = text.charAt(i);

            switch (currChar) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'O':
                case 'I':
                case 'U':
                    sum += currChar * text.length();
                    break;
                default:
                    sum += currChar / text.length();
            }
        }
        return sum;
    }
}
