package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int quantities = Integer.parseInt(scanner.nextLine());
            if (capacity - (sum + quantities) < 0) {
                System.out.println("Insufficient capacity!");
            } else {
                sum += quantities;
            }
        }
        System.out.println(sum);
    }
}
