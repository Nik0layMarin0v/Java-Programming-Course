package textProcessing.exercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s+"); //P34562Z q2576f H456z


        double totalSum = 0;
        for(String couple: array) {
            double currentSum = 0;
            char firstLetter = couple.charAt(0);
            char secondLetter = couple.charAt(couple.length() - 1);
            double num = Double.parseDouble(couple.substring(1, couple.length() - 1));

            int position = 0;
            if(Character.isUpperCase(firstLetter)) {
                position = (int) firstLetter - 64;
                currentSum = 1.0 * num / position;
            } else if (Character.isLowerCase(firstLetter)) {
                position = (int) firstLetter - 96;
                currentSum = num * position;
            }

            if(Character.isUpperCase(secondLetter)) {
                position = (int) secondLetter - 64;
                currentSum = currentSum - position;
            } else if (Character.isLowerCase(secondLetter)) {
                position = (int) secondLetter - 96;
                currentSum = currentSum + position;
            }

            totalSum += currentSum;
        }

        System.out.printf("%.2f", totalSum);
    }
}
