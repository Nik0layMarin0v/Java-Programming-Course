package FirstSteps.Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int litersPreparation = Integer.parseInt(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

//          • Пакет химикали - 5.80 лв.
//          • Пакет маркери - 7.20 лв.
//          • Препарат - 1.20 лв (за литър)

        double sumWithoutDiscount = pens * 5.80 + markers * 7.20 + litersPreparation * 1.20;
        double sumWithDiscount = sumWithoutDiscount - sumWithoutDiscount * discountPercentage / 100;

        System.out.println(sumWithDiscount);
    }
}
