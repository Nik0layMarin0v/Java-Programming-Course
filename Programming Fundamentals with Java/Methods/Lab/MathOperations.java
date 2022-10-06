package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int num2 = Integer.parseInt(scanner.nextLine());
        double finalNum = performMathOperation(num1,operator,num2);
        DecimalFormat df = new DecimalFormat("0.##");
        System.out.println(df.format(finalNum));
    }
    public static double performMathOperation(int a, char o, int b) {
        double result = 0;
        switch (o) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / (b * 1.0);
                break;
            case '*':
                result = a * b;
                break;
        }
        return result;
    }
}
