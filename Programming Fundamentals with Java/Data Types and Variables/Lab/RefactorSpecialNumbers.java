package dataTypesAndVariables.lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int curNum = 0;
        boolean specialOrNot = false;
        for (int i = 1; i <= n; i++) {
            curNum = i;
            while (curNum > 0) {
                sum += curNum % 10;
                curNum = curNum / 10;
            }
            specialOrNot = (sum == 5) || (sum == 7) || (sum == 11);
            if (specialOrNot) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }
            sum = 0;
        }


    }
}
