package textProcessing.exercise;

import com.sun.jdi.Value;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder reversedNum = new StringBuilder();
        int residue = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int multiply = currentDigit * n + residue;
            reversedNum.append(multiply % 10);
            residue = multiply / 10;
        }
        if (residue != 0) {
            reversedNum.append(residue);
        }

        reversedNum = reversedNum.reverse();
        boolean zero = true;
        for (int i = 0; i < reversedNum.length(); i++) {
            if (reversedNum.charAt(i) != '0') {
                zero = false;
            }
        }

        if (zero) {
            System.out.println(0);
        } else {
            StringBuilder result = new StringBuilder();
            boolean beginning = true;
            for (int i = 0; i < reversedNum.length(); i++) {
                char curChar = reversedNum.charAt(i);
                if (curChar == '0' && beginning) {

                } else {
                    beginning = false;
                    result.append(curChar);
                }
            }
            System.out.println(result);
        }

    }
}
