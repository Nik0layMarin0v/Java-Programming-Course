package NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String film = scanner.nextLine();
        int students = 0;
        int standards = 0;
        int kids = 0;
        int totalTickets = 0;
        int currentTickets = 0;
        char symbol = '%';

        while (!film.equals("Finish")) {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            String ticketStatus = scanner.nextLine();

            while (!ticketStatus.equals("End")) {
                totalTickets++;
                currentTickets++;

                switch (ticketStatus) {
                    case "standard":
                        standards++;
                        break;
                    case "student":
                        students++;
                        break;
                    case "kid":
                        kids++;
                        break;
                }
                if (currentTickets == freeSeats) {
                    break;
                }
                ticketStatus = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%c full.%n", film, (currentTickets * 100.0) / freeSeats, symbol);
            currentTickets = 0;
            film = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%c student tickets.%n", (students * 100.0) / totalTickets, symbol);
        System.out.printf("%.2f%c standard tickets.%n", (standards * 100.0) / totalTickets, symbol);
        System.out.printf("%.2f%c kids tickets.%n", (kids * 100.0) / totalTickets, symbol);
    }
}