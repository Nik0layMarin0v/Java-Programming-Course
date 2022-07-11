package ConditionalStatements.Lab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int residue = number % 2;

        if (residue == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
