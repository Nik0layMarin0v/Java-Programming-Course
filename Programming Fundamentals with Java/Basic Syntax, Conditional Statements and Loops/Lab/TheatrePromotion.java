package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        char symbol = '$';

        switch (dayType) {
            case "Weekday":
                if (age >= 0 && age <= 18) {
                    price = 12;
                } else if (age >= 19 && age <= 64) {
                    price = 18;
                } else if (age >= 65 && age <= 122) {
                    price = 12;
                }
                break;
            case "Weekend":
                if (age >= 0 && age <= 18) {
                    price = 15;
                } else if (age >= 19 && age <= 64) {
                    price = 20;
                } else if (age >= 65 && age <= 122) {
                    price = 15;
                }
                break;
            case "Holiday":
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age >= 19 && age <= 64) {
                    price = 12;
                } else if (age >= 65 && age <= 122) {
                    price = 10;
                }
                break;
        }

        if (price != 0) {
            System.out.printf("%d%c", price, symbol);
        } else {
            System.out.println("Error!");
        }
    }
}
