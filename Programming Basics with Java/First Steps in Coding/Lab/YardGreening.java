package FirstSteps.Lab;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());

        double firstPrice = area * 7.61;
        double discount = firstPrice * 0.18;
        double finalPrice = firstPrice - discount;

        System.out.printf("The final price is: %f lv.%n", finalPrice);
        System.out.printf("The discount is: %f lv.", discount);
    }
}
