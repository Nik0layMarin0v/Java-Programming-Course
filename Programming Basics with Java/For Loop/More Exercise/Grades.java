package ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int students = Integer.parseInt(scanner.nextLine());

        int topStudents = 0;
        int between4And5 = 0;
        int between3And4 = 0;
        int fail = 0;
        double gradeSum = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());

            gradeSum = gradeSum + grade;

            if (grade < 3) {
                fail = fail + 1;
            } else if (grade < 4) {
                between3And4 = between3And4 + 1;
            } else if (grade < 5) {
                between4And5 = between4And5 + 1;
            } else {
                topStudents = topStudents + 1;
            }

        }

        char percent = '%';
        System.out.printf("Top students: %.2f%c%n", topStudents * 100.0 / students, percent);
        System.out.printf("Between 4.00 and 4.99: %.2f%c%n", between4And5 * 100.0 / students, percent);
        System.out.printf("Between 3.00 and 3.99: %.2f%c%n", between3And4 * 100.0 / students, percent);
        System.out.printf("Fail: %.2f%c%n", fail * 100.0 / students, percent);
        System.out.printf("Average: %.2f", gradeSum / students);

    }

    public static class CleverLily {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
            double laundry = Double.parseDouble(scanner.nextLine());
            int toyPrice = Integer.parseInt(scanner.nextLine());

            int toys = 0;
            int money = 0;
            for (int i = 1; i <= n; i++) {

                if (i % 2 == 1) {
                    toys = toys + toyPrice;
                } else {
                    money = money + 10 * i / 2 - 1;
                }
            }

            int allMoney = money + toys;
            double diff = Math.abs(allMoney - laundry);

            if (allMoney >= laundry) {
                System.out.printf("Yes! %.2f", diff);
            } else {
                System.out.printf("No! %.2f", diff);
            }
        }
    }
}
