package FirstSteps.Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

         int a = 5;
         if (a > 0) {
             if (a % 2 == 0) {
                 System.out.println("even");
             } else {
                 System.out.println("odd");
             }
         } else {
             System.out.println("Negative");
         }


        int yearTax = Integer.parseInt (scanner.nextLine());

        double shoes = yearTax * 0.6;
        double suit = shoes * 0.8;
        double ball = suit / 4;
        double accessories = ball / 5;

        double totalSum = yearTax + shoes + ball + suit + accessories;

        System.out.println(totalSum);

    }
}
