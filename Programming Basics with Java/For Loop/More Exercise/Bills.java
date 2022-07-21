package ForLoop.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int months = Integer.parseInt(scanner.nextLine());

        double others = 0;
        double allElectricity = 0;
        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());

            allElectricity = allElectricity + electricity;

            others = others + (electricity + 20 + 15) * 1.2;

        }

        System.out.printf("Electricity: %.2f lv%n", allElectricity);
        System.out.printf("Water: %.2f lv%n", months * 20.0);
        System.out.printf("Internet: %.2f lv%n", months * 15.0);
        System.out.printf("Other: %.2f lv%n", others);
        System.out.printf("Average: %.2f lv", (allElectricity + months * 20.0 + months * 15.0 + others) / months);


    }
}
