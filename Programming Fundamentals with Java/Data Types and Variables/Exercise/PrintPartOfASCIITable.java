package dataTypesAndVariables.exercise;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        String result = "";
        for (char i = (char) start; i <= end ; i++) {
            result = result + i + " ";
        }
        System.out.println(result);
    }
}
