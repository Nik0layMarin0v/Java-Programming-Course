package WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int pieces = length * width;
        int leftPieces = pieces;
        boolean notEnough = false;
        String input = scanner.nextLine();

        while (!input.equals("STOP")) {
            int take = Integer.parseInt(input);
            leftPieces = leftPieces - take;
            if (leftPieces <= 0) {
                notEnough = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (notEnough) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(leftPieces));
        } else {
            System.out.printf("%d pieces are left.", leftPieces);
        }
    }
}
