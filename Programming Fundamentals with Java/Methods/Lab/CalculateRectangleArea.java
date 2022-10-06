package methods.lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());

        double area = areaCalculation(width, length);
        System.out.printf("%.0f", area);
    }

    public static double areaCalculation(double w, double l) {
        return w * l;
    }
}
