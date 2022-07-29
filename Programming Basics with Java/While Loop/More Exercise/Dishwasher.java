package WhileLoop.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int detergent = Integer.parseInt(scanner.nextLine()) * 750;
        String input = scanner.nextLine();
        int count = 0;
        int leftDetergent = detergent;
        boolean notEnough = false;
        int plates = 0;
        int pots = 0;
        while (!input.equals("End")) {
            count++;
            int dishes = Integer.parseInt(input);
            if (count % 3 != 0) {
                plates += dishes;
                leftDetergent = leftDetergent - dishes * 5;
            } else {
                leftDetergent = leftDetergent - dishes * 15;
                pots += dishes;
            }
            if (leftDetergent < 0) {
                notEnough = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (notEnough) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(leftDetergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.%n", plates, pots);
            System.out.printf("Leftover detergent %d ml.", leftDetergent);
        }
    }
}
