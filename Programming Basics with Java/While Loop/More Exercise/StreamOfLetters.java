package WhileLoop.MoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int CCount = 0;
        int OCount = 0;
        int NCount = 0;
        String word = "";

        while (!input.equals("End")) {
            char symbol = input.charAt(0);
            if (symbol < 65 || symbol > 122 ||symbol > 90 && symbol < 97) {
                input = scanner.nextLine();
            } else if (symbol == 'c' && CCount == 0) {
                CCount = 1;
                if (CCount == 1 && NCount == 1 && OCount == 1) {
                    System.out.print(word + " ");
                    word = "";
                    NCount = 0;
                    OCount = 0;
                    CCount = 0;
                    input = scanner.nextLine();

                } else {
                    input = scanner.nextLine();
                }
            } else if (symbol == 'n' && NCount == 0) {
                NCount = 1;
                if (CCount == 1 && NCount == 1 && OCount == 1) {
                    System.out.print(word + " ");
                    word = "";
                    NCount = 0;
                    OCount = 0;
                    CCount = 0;
                    input = scanner.nextLine();
                } else {
                    input = scanner.nextLine();

                }
            } else if (symbol == 'o' && OCount == 0) {
                OCount = 1;
                if (CCount == 1 && NCount == 1 && OCount == 1) {
                    System.out.print(word + " ");
                    word = "";
                    NCount = 0;
                    OCount = 0;
                    CCount = 0;
                    input = scanner.nextLine();

                } else {
                    input = scanner.nextLine();

                }
            } else {
                word = word + symbol;
                input = scanner.nextLine();
            }
        }
    }
}
