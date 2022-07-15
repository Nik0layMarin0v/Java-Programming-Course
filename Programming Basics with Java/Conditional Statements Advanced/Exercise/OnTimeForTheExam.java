package AdvancedConditionalStatements.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hoursExam = Integer.parseInt(scanner.nextLine());
        int minutesExam = Integer.parseInt(scanner.nextLine());
        int hoursArriving = Integer.parseInt(scanner.nextLine());
        int minutesArriving = Integer.parseInt(scanner.nextLine());

        int exam = hoursExam * 60 + minutesExam;
        int arriving = hoursArriving * 60 + minutesArriving;
        String arrivingStatus = "";

        if (exam < arriving) {
            arrivingStatus = "Late";
        } else if (exam - arriving <= 30) {
            arrivingStatus = "On time";
        } else {
            arrivingStatus = "Early";
        }

        System.out.println(arrivingStatus);
        int diff = Math.abs(arriving - exam);

        if (arriving < exam) {
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", diff / 60, diff % 60);
            }
        } else if (arriving > exam) {
             if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", diff / 60, diff % 60);
            }
        }
    }
}
