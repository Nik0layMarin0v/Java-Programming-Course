package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int debit1 = Integer.parseInt(scanner.nextLine());
        int debit2 = Integer.parseInt(scanner.nextLine());
        double absenceTime = Double.parseDouble(scanner.nextLine());

        double activity1 = debit1 * absenceTime;
        double activity2 = debit2 * absenceTime;
        double totalActivity = activity1 + activity2;

        if (totalActivity <= volume) {
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f. Pipe 2: %.2f.", totalActivity * 100 / volume, activity1 * 100 / totalActivity, activity2 * 100 / totalActivity);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", absenceTime, totalActivity - volume);
        }

    }
}
