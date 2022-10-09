package methods.exercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.println(findTheSmallest(num1, num2, num3));
    }

    public static int findTheSmallest(int a, int b, int c) {
        int smallest = 0;
        if (a > b && b < c) {
            smallest = b;
        } else if (b > c && c < a) {
            smallest = c;
        } else {
            smallest = a;
        }
        return smallest;
    }
}
