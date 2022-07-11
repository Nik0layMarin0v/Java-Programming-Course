package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int runner1 = Integer.parseInt(scanner.nextLine());
        int runner2 = Integer.parseInt(scanner.nextLine());
        int runner3 = Integer.parseInt(scanner.nextLine());

        int secSum = runner1 + runner2 + runner3;
        int min = secSum / 60;
        int sec = secSum % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", min, sec);
        }
        else {
            System.out.printf("%d:%d", min, sec);
        }



    }
}
