package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int volume = length * height * width;
        int leftSpace = volume;
        boolean isOverCrowded = false;
        while (!input.equals("Done")) {
            int boxes = Integer.parseInt(input);
            leftSpace = leftSpace - boxes;
            if (leftSpace <= 0) {
                isOverCrowded = true;
                break;
            }
            input = scanner.nextLine();
        }
        if (isOverCrowded) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(leftSpace));
        } else {
            System.out.printf("%d Cubic meters left.", leftSpace);
        }

    }
}
