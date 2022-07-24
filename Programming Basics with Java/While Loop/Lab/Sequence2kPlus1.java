package WhileLoop.Lab;

import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int sequence = 1;
        while (num >= sequence) {
            System.out.println(sequence);
            sequence = sequence * 2 + 1;
        }

    }
}
