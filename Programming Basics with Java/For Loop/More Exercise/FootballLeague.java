package ForLoop.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxFens = Integer.parseInt(scanner.nextLine());
        int fens = Integer.parseInt(scanner.nextLine());

        int AFens = 0;
        int BFens = 0;
        int VFens = 0;
        int GFens = 0;

        for (int i = 0; i < fens; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    AFens = AFens + 1;
                    break;
                case "B":
                    BFens = BFens + 1;
                    break;
                case "V":
                    VFens = VFens + 1;
                    break;
                case "G":
                    GFens = GFens + 1;
                    break;
            }
        }

        char percent = '%';
        System.out.printf("%.2f%c%n", AFens * 100.0 / fens, percent);
        System.out.printf("%.2f%c%n", BFens * 100.0 / fens, percent);
        System.out.printf("%.2f%c%n", VFens * 100.0 / fens, percent);
        System.out.printf("%.2f%c%n", GFens * 100.0 / fens, percent);
        System.out.printf("%.2f%c%n", fens * 100.0 / maxFens, percent);

    }
}
