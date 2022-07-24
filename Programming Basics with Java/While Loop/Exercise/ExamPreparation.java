package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int allowableFails = Integer.parseInt(scanner.nextLine());
        String problemName = scanner.nextLine();

        int gradeSum = 0;
        int problems = 0;
        String lastProblem = "";
        int fails = 0;
        boolean rest = true;

        while (!problemName.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                fails ++;
            }
            problems ++;
            if (fails >= allowableFails) {
                rest = false;
                break;
            }
            gradeSum = gradeSum + grade;
            lastProblem = problemName;
            problemName = scanner.nextLine();
        }

        if (rest) {
            System.out.printf("Average score: %.2f%n", 1.0 * gradeSum / problems);
            System.out.printf("Number of problems: %d%n", problems);
            System.out.printf("Last problem: %s", lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", allowableFails);
        }

    }
}
