package methods.lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());

        double poweredNum = poweringNumbers(num, power);
        DecimalFormat df = new DecimalFormat("0.####");
        System.out.println(df.format(poweredNum));
    }

    public static double poweringNumbers(double n, double p) {
        double result = 1;
        for (int i = 0; i < p; i++) {
            result = n * result;
        }
        return result;
    }
}
