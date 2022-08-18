package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0.0;

        switch (day) {
            case "Friday":
                if (type.equals("Students")) {
                    price = 8.45;
                } else if (type.equals("Business")) {
                    price = 10.9;
                } else if (type.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (type.equals("Students")) {
                    price = 9.8;
                } else if (type.equals("Business")) {
                    price = 15.6;
                } else if (type.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (type.equals("Students")) {
                    price = 10.46;
                } else if (type.equals("Business")) {
                    price = 16;
                } else if (type.equals("Regular")) {
                    price = 22.5;
                }
                break;
        }
        double totalPrice = 0;
        if (type.equals("Students") && people >= 30) {
            totalPrice = price * people * 0.85;
        } else if (type.equals("Business") && people >= 100) {
            totalPrice = price * (people - 10);
        } else if (type.equals("Regular") && people >= 10 && people <= 20) {
            totalPrice = price * people * 0.95;
        } else {
            totalPrice = price * people;
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
