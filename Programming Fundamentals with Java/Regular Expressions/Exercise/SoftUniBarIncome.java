package regularExpressions.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalSum = 0;
        while (!input.equals("end of shift")) {
            Pattern pattern = Pattern.compile("%(?<name>[A-Z][a-z]+)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>\\d+)\\|[^|$%.]*?(?<price>\\d+\\.?\\d*)\\$");
            Matcher matcher = pattern.matcher(input);

            double moneyToAdd = 0;
            if (matcher.find()) {
                String name = matcher.group("name");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("count"));
                double price = Double.parseDouble(matcher.group("price"));
                moneyToAdd = price * count;
                System.out.printf("%s: %s - %.2f%n", name, product, moneyToAdd);
            }

            totalSum += moneyToAdd;
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", totalSum);
    }
}
