package regularExpressions.exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder piecesOfFurniture = new StringBuilder();

        while (!input.equals("Purchase")) {
            piecesOfFurniture.append(input);
            input = scanner.nextLine();
        }

        Pattern pattern = Pattern.compile(">>(?<name>\\w+)<<(?<price>\\d+.?\\d*)!(?<quantity>\\d+)");
        Matcher matcher = pattern.matcher(piecesOfFurniture);

        double totalSum = 0;
        System.out.println("Bought furniture:");
        while (matcher.find()) {
            String name = matcher.group(1);
            double price = Double.parseDouble(matcher.group(2));
            int quantity = Integer.parseInt(matcher.group(3));

            System.out.println(name);
            totalSum += price * quantity;
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
