package WhileLoop.Lab;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int maxNum = MIN_VALUE;
        while (!input.equals("Stop")){
            int num = Integer.parseInt(input);

            if (num > maxNum) {
                maxNum = num;
            }
            input = scanner.nextLine();
        }

        System.out.println(maxNum);
    }
}
