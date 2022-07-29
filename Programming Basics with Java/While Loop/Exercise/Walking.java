package WhileLoop.Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {


//        1500
//        3000
//        250
//        1548
//        2000
//        Going home
//        2000
        Scanner scanner = new Scanner(System.in);
        int totalSteps = 0;

        while (totalSteps < 10000) {
            String input = scanner.nextLine();

            if (input.equals("Going home")) {
                int lastSteps = Integer.parseInt(scanner.nextLine());
                totalSteps = totalSteps + lastSteps;
                break;
            }

            int steps = Integer.parseInt(input);
            totalSteps = totalSteps + steps;
        }

        int diff = Math.abs(totalSteps - 10000);
        if (totalSteps >= 10000) {
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }

    }
}
