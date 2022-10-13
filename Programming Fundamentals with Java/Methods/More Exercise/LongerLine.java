package methods.moreExercises;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Ax = Integer.parseInt(scanner.nextLine());
        int Ay = Integer.parseInt(scanner.nextLine());
        int Bx = Integer.parseInt(scanner.nextLine());
        int By = Integer.parseInt(scanner.nextLine());
        int Cx = Integer.parseInt(scanner.nextLine());
        int Cy = Integer.parseInt(scanner.nextLine());
        int Dx = Integer.parseInt(scanner.nextLine());
        int Dy = Integer.parseInt(scanner.nextLine());

        int line1 = lineLength(Ax, Ay, Bx, By);
        int line2 = lineLength(Cx, Cy, Dx, Dy);
        if (line1 >= line2) {
            System.out.println(closestToTheCenterPoint(Ax, Ay, Bx, By));
        } else {
            System.out.println(closestToTheCenterPoint(Cx, Cy, Dx, Dy));
        }

    }



    public static int lineLength (int x1, int y1, int x2, int y2) {
        int side1 = Math.abs(x1 - x2);
        int side2 = Math.abs(y1 - y2);

        int line = side1 * side1 + side2 * side2;
        return line;
    }



    public static String closestToTheCenterPoint(int x1, int y1, int x2, int y2) {
        int distance1 = lineLength(x1, y1, 0, 0);
        int distance2 = lineLength(0, 0 , x2, y2);

        String closestCoordinates = "";
        if (distance2 < distance1) {
            closestCoordinates = String.format("(%d, %d)(%d, %d)", x2, y2, x1, y1);
        } else {
            closestCoordinates = String.format("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        }
        return closestCoordinates;
    }
}
