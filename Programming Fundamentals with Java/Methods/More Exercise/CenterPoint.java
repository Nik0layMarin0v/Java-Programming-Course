package methods.moreExercises;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        System.out.println(closestToTheCenterPoint(x1, y1, x2, y2));
    }

    public static String closestToTheCenterPoint(int x1, int y1, int x2, int y2) {
        int sum1 = Math.abs(x1 + y1);
        int sum2 = Math.abs(x2 + y2);

        String closestCoordinates = "";
        if (sum2 < sum1) {
            closestCoordinates = String.format("(%d, %d)", x2, y2);
        } else {
            closestCoordinates = String.format("(%d, %d)", x1, y1);
        }
        return closestCoordinates;
    }
 }
