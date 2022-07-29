package WhileLoop.Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double charge = Double.parseDouble(scanner.nextLine()) * 100;

        int coins = 0;
        while (charge > 0) {
            if (charge >= 200) {
                charge -= 200;
            } else if (charge >= 100) {
                charge -= 100;
            } else if (charge >= 50) {
                charge -= 50;
            } else if (charge >= 20) {
                charge -= 20;
            } else if (charge >= 10) {
                charge -= 10;
            } else if (charge >= 5) {
                charge -= 5;
            } else if (charge >= 2) {
                charge -= 2;
            } else if (charge >= 1) {
                charge -= 1;
            } else {
                break;
            }
            coins++;

        }
        System.out.println(coins);
    }
}
