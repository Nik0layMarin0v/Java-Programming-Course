package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double apartment = 0.0;
        double studio = 0.0;

        switch (month) {
            case "May":
            case "October":
                if (days <= 7) {
                    apartment = days * 65.0;
                    studio = days * 50.0;
                } else if (days <= 14) {
                    apartment = days * 65.0;
                    studio = days * 50.0 * 0.95;
                } else {
                    apartment = days * 65.0 * 0.9;
                    studio = days * 50.0 * 0.7;
                }
                break;
            case "June":
            case "September":
                if (days <= 14) {
                    apartment = days * 68.70;
                    studio = days * 75.20;
                } else {
                    apartment = days * 68.70 * 0.9;
                    studio = days * 75.20 * 0.8;
                }
                break;
            case "July":
            case "August":
                if (days <= 14) {
                    apartment = days * 77.0;
                    studio = days * 76.0;
                } else {
                    apartment = days * 77.0 * 0.9;
                    studio = days * 76.0;
                    break;
                }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment, studio);
    }
}
