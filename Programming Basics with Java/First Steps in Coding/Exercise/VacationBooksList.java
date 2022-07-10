package FirstSteps.Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int allHours = bookPages / pagesPerHour;
        int hoursPerDay = allHours / days;

        System.out.println(hoursPerDay);
    }
}
