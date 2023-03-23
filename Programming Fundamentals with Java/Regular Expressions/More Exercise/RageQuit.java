package regularExpressions.moreExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<symbols>[\\D]+)(?<number>\\d+)");
        Matcher matcher = pattern.matcher(input);


        StringBuilder result = new StringBuilder();
        while (matcher.find()) {
            StringBuilder convertedSymbols = new StringBuilder();
            String symbol = matcher.group("symbols");
            int number = Integer.parseInt(matcher.group("number"));

            for (int i = 0; i < number; i++) {
                convertedSymbols.append(symbol.toUpperCase());
            }
            result.append(convertedSymbols);
        }

        List<Character> uniqueSymbols = new ArrayList<>();
        for (int i = 0; i < result.length(); i++) {
            if (!uniqueSymbols.contains(result.charAt(i))) {
                uniqueSymbols.add(result.charAt(i));
            }
        }

        System.out.printf("Unique symbols used: %d%n", uniqueSymbols.size());
        System.out.println(result);
    }
}
