package FirstSteps.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceSprat = Double.parseDouble(scanner.nextLine());
        double bonitoKg = Double.parseDouble(scanner.nextLine());
        double scadKg = Double.parseDouble(scanner.nextLine());
        int musselsKg = Integer.parseInt(scanner.nextLine());

        double bonitoPrice = (priceMackerel + priceMackerel * 0.60) * bonitoKg;
        double scadPrice = (priceSprat + priceSprat * 0.80) * scadKg;
        double musselPrice = musselsKg * 7.5;

        double sum = bonitoPrice + scadPrice + musselPrice;
        System.out.printf("%.2f", sum);

    }
}
