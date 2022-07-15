package AdvancedConditionalStatements.Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

//        плод	    banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	    2.50	1.20	0.85	1.45	    2.70	5.50	    3.85
//
//        плод	    banana	apple	orange	grapefruit	kiwi	pineapple	grapes
//        цена	    2.70	1.25	0.90	1.60	    3.00	5.60	    4.20

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", 2.50 * quantity);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", 1.20 * quantity);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", 0.85 * quantity);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", 1.45 * quantity);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", 2.70 * quantity);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", 5.50 * quantity);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", 3.85 * quantity);
            } else {
                System.out.println("error");
            }
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) {
                System.out.printf("%.2f", 2.70 * quantity);
            } else if (fruit.equals("apple")) {
                System.out.printf("%.2f", 1.25 * quantity);
            } else if (fruit.equals("orange")) {
                System.out.printf("%.2f", 0.90 * quantity);
            } else if (fruit.equals("grapefruit")) {
                System.out.printf("%.2f", 1.60 * quantity);
            } else if (fruit.equals("kiwi")) {
                System.out.printf("%.2f", 3.00 * quantity);
            } else if (fruit.equals("pineapple")) {
                System.out.printf("%.2f", 5.60 * quantity);
            } else if (fruit.equals("grapes")) {
                System.out.printf("%.2f", 4.20 * quantity);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }

    }
}
