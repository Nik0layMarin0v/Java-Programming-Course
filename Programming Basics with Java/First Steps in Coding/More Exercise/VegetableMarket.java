package FirstSteps.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double oneKgVegetablesPrice = Double.parseDouble(scanner.nextLine());
        double oneKgFruitPrice = Double.parseDouble(scanner.nextLine());
        int vegetablesWeight = Integer.parseInt(scanner.nextLine());
        int fruitWeight = Integer.parseInt(scanner.nextLine());

        double BGNSum = (vegetablesWeight * oneKgVegetablesPrice) + (fruitWeight * oneKgFruitPrice);
        double EUROSum = BGNSum / 1.94;

        System.out.printf("%.2f", EUROSum);
    }
}
