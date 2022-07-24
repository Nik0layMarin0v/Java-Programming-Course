package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        double sum = 0;
        int n = 0;
        int poorGrades = 0;

        while (true) {
            n++;
            double grade = Double.parseDouble(scanner.nextLine());
            sum = sum + grade;

            if (grade < 4) {
                poorGrades++;
            }
            if (poorGrades == 2) {
                System.out.printf("%s has been excluded at %d grade", name, n - 1);
                break;
            }
            if (n == 12) {
                System.out.printf("%s graduated. Average grade: %.2f", name, sum / 12);
                break;
            }
        }

    }
}
