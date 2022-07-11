package ConditionalStatements.Exercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeInSeconds = hours * 60 + minutes;
        int time15MinutesLater = timeInSeconds + 15;

        int minutes2 = time15MinutesLater % 60;

        int hours2 = time15MinutesLater / 60;

        if (minutes2 < 10) {
            if (hours2 == 24){
                System.out.printf("0:0%d", minutes2);
            }
            else {
                System.out.printf("%d:0%d",hours2, minutes2);
            }

        } else {
            if (hours2 == 24) {
            System.out.printf("0:%d", minutes2);
            }
            else {
                System.out.printf("%d:%d",hours2, minutes2);
            }
        }


    }
}
