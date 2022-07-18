package ForLoop.Exercise;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum < 200) {
                p1 = p1 + 1;
            } else if (currentNum < 400) {
                p2 = p2 + 1;
            } else if (currentNum < 600) {
                p3 = p3 + 1;
            } else if (currentNum < 800) {
                p4 = p4 + 1;
            } else {
                p5 = p5 + 1;
            }
        }

        char symbol = '%';
        System.out.printf("%.2f%c%n%.2f%c%n%.2f%c%n%.2f%c%n%.2f%c", (p1 * 1.0 / n * 1.0 * 100.0), symbol,
                (p2 * 1.0 / n * 1.0 * 100.0), symbol,
                (p3 * 1.0 / n * 1.0 * 100.0), symbol,
                (p4 * 1.0 / n * 1.0 * 100.0), symbol,
                (p5 * 1.0 / n * 1.0 * 100.0), symbol);
    }
}