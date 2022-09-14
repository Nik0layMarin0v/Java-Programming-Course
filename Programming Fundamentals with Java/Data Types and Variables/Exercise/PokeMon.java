package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        byte Y = Byte.parseByte(scanner.nextLine());

        int currentN = N;
        short targetCounter = (short) 0;
        while (currentN >= M) {
            targetCounter++;
            currentN -= M;
            if (currentN * 2 == N) {
                if (currentN / Y > 0 && Y > 0) {
                    currentN = currentN / Y;
                }
            }
        }
        System.out.println(currentN);
        System.out.println(targetCounter);
    }
}
