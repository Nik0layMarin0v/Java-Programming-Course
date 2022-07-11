package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int GPU = Integer.parseInt(scanner.nextLine());
        int CPU = Integer.parseInt(scanner.nextLine());
        int RAM = Integer.parseInt(scanner.nextLine());

        double GPUTotalPrice = 250 * GPU;
        double CPUPrice = 0.35 * GPUTotalPrice;
        double RAMPrice = 0.1 * GPUTotalPrice;

        double totalSum = (GPUTotalPrice) + (CPUPrice * CPU) + (RAMPrice * RAM);
         if (GPU > CPU) {
             totalSum = 0.85 * totalSum;
        }

         double diff = Math.abs(budget - totalSum);
         if (budget >= totalSum) {
             System.out.printf("You have %.2f leva left!", diff);
         } else {
             System.out.printf("Not enough money! You need %.2f leva more!", diff);
         }


    }
}
