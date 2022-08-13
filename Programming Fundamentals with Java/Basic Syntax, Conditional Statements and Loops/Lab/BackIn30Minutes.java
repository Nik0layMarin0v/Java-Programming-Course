package basicSyntaxConditionalStatementsAndLoops.lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int time = hours * 60 + minutes;
        int finalTime = time + 30;

        int finalHours = finalTime / 60;
        int finalMinutes = finalTime % 60;

        if (finalHours == 24) {
            finalHours = 0;
        }
        System.out.printf("%d:%02d", finalHours, finalMinutes);
    }
}
