package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int seats = rows * columns;
        switch (projectionType) {
            case "Premiere":
                System.out.printf("%.2f", seats * 12.0);
                break;
            case "Normal":
                System.out.printf("%.2f", seats * 7.5);
                break;
            case "Discount":
                System.out.printf("%.2f", seats * 5.0);
                break;
        }

    }
}
