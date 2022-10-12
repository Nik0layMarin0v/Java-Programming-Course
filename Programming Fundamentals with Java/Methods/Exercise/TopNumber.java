package methods.exercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            if (divisibleBy8(i) && containingOneOddDigit(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean divisibleBy8(int a) {
        String num = "" + a;
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            sum += (int)num.charAt(i);
        }
        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean containingOneOddDigit(int a) {
        String num = "" + a;
        boolean valid = false;
        for (int i = 0; i < num.length(); i++) {
            if ((int)num.charAt(i) % 2 == 1) {
                valid = true;
                break;
            }
        }
        return valid;
    }
}
