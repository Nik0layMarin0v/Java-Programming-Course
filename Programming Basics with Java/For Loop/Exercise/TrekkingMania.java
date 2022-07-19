package ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groups = Integer.parseInt(scanner.nextLine());

//           Група до 5 човека – изкачват Мусала
//           Група от 6 до 12 човека – изкачват Монблан
//           Група от 13 до 25 човека – изкачват Килиманджаро
//           Група от 26 до 40 човека – изкачват К2
//           Група от 41 или повече човека – изкачват Еверест

        int totalSum = 0;
        int MusalaSum = 0;
        int MontBlancSum = 0;
        int KilimanjaroSum = 0;
        int K2Sum = 0;
        int EverestSum = 0;

        for (int i = 0; i < groups; i++) {
            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            totalSum = totalSum + peopleInGroup;
            if (peopleInGroup <= 5) {
                MusalaSum = MusalaSum + peopleInGroup;
            } else  if (peopleInGroup <= 12) {
                MontBlancSum = MontBlancSum + peopleInGroup;
            } else  if (peopleInGroup <= 25) {
                KilimanjaroSum = KilimanjaroSum + peopleInGroup;
            } else  if (peopleInGroup <= 40) {
                K2Sum = K2Sum + peopleInGroup;
            } else {
                EverestSum = EverestSum + peopleInGroup;
            }
        }

        char symbol = '%';
        System.out.printf("%.2f%c%n", 100.0 * MusalaSum / totalSum, symbol);
        System.out.printf("%.2f%c%n", 100.0 * MontBlancSum / totalSum, symbol);
        System.out.printf("%.2f%c%n", 100.0 * KilimanjaroSum / totalSum, symbol);
        System.out.printf("%.2f%c%n", 100.0 * K2Sum / totalSum, symbol);
        System.out.printf("%.2f%c", 100.0 * EverestSum / totalSum, symbol);

    }
}
