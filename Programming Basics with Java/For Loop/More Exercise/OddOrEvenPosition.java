package ForLoop.MoreExercises;

import java.util.Scanner;

import static java.lang.Long.MAX_VALUE;
import static java.lang.Long.MIN_VALUE;

public class OddOrEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = MAX_VALUE;
        double oddMax = MIN_VALUE;
        double evenSum = 0;
        double evenMin = MAX_VALUE;
        double evenMax = MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 1) {
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                } if (num < oddMin) {
                    oddMin = num;
                }
            } else {
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                } if (num < evenMin) {
                    evenMin = num;
                }
            }
        }

        if (oddMax == oddMin && evenMax == evenMin) {
            System.out.printf("OddSum=%.2f,%nOddMin=%s,%nOddMax=%s,%nEvenSum=%.2f,%nEvenMin=%s,%nEvenMax=%s", oddSum, "No", "No", evenSum, "No", "No");
        } else if (evenMax == evenMin) {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=%s,%nEvenMax=%s", oddSum, oddMin, oddMax, evenSum, "No", "No");
        } else if (oddMax == oddMin) {
            System.out.printf("OddSum=%.2f,%nOddMin=%s,%nOddMax=%s,%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f", oddSum, "No", "No", evenSum, evenMin, evenMax);
        } else{
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f", oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
        }
    }
}
