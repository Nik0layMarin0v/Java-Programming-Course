package NestedLoops.Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();

        while (!destination.equals("End")) {
            double neededMoney = Double.parseDouble(scanner.nextLine());
            double currentMoney = 0;
            while (currentMoney < neededMoney) {
                double money = Double.parseDouble(scanner.nextLine());
                currentMoney += money;
            }
            System.out.printf("%nGoing to %s!", destination);
            destination = scanner.nextLine();
        }


    }
}
