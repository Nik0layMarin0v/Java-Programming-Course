package methods.lab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                printCoffeeTotalPrice(quantity);
                break;
            case "water":
                printWaterTotalPrice(quantity);
                break;
            case "coke":
                printCokeTotalPrice(quantity);
                break;
            case "snacks":
                printSnacksTotalPrice(quantity);
                break;
        }

    }

    public static void printCoffeeTotalPrice(int q) {
        System.out.printf("%.2f", q * 1.5);
    }

    public static void printWaterTotalPrice(int q) {
        System.out.printf("%.2f", q * 1.0);
    }

    public static void printCokeTotalPrice(int q) {
        System.out.printf("%.2f", q * 1.4);
    }

    public static void printSnacksTotalPrice(int q) {
        System.out.printf("%.2f", q * 2.0);
    }

}
