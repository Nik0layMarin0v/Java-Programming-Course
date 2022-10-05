package methods.lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String calculation = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (calculation) {
            case "add":
                addition(firstNum,secondNum);
                break;
            case "multiply":
                multiplication(firstNum, secondNum);
                break;
            case "subtract":
                subtraction(firstNum, secondNum);
                break;
            case "divide":
                division(firstNum,  secondNum);
                break;
        }
    }

    public static void addition (int a, int b) {
        System.out.println(a + b);
    }
    public static void multiplication (int a, int b) {
        System.out.println(a * b);
    }
    public static void subtraction (int a, int b) {
        System.out.println(a - b);
    }
    public static void division (int a, int b) {
        System.out.println(a / b);
    }
}
