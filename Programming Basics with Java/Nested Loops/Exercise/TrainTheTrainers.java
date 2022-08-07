package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int judges = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double allGrades = 0;
        int projects = 0;
        while (!input.equals("Finish")) {
            projects ++;
            double totalGrade = 0;
            for (int i = 0; i < judges; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                totalGrade += grade;
                allGrades += grade;
            }
            System.out.printf("%s - %.2f.%n", input, totalGrade / judges);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", allGrades / (judges * projects));
    }
}
