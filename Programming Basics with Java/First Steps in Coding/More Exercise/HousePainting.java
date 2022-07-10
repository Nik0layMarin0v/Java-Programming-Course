package FirstSteps.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // x - house height
        // y - house width
        // h - roof height
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wallsArea = (2 * x * x) + (2 * x * y) - 6.9;
        double greenPaint = wallsArea / 3.4;

        double roofArea = (2 * x * y) + (x * h);
        double redPaint = roofArea / 4.3;

        System.out.printf("%.2f %n", greenPaint);
        System.out.printf("%.2f", redPaint);
    }
}
