package dataTypesAndVariables.exercise;

import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

public class Snowballs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int highestValue = MIN_VALUE;
        int highestSnow = MIN_VALUE;
        int highestTime = MIN_VALUE;
        int highestQuality = MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            int st = snow / time;
            int value = (int) Math.pow(st, quality);
            if (value > highestValue) {
                highestValue = value;
                highestQuality = quality;
                highestSnow = snow;
                highestTime = time;
            }
        }
        System.out.printf("%d : %d = %d (%d)", highestSnow, highestTime, highestValue, highestQuality);
    }
}
