package regularExpressions.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<day>\\d{2})([-\\/.])(?<month>[A-Z][a-z]{2})\\2(?<year>\\d{4})");
        Matcher marcher = pattern.matcher(input);

        while (marcher.find()) {

            String day = marcher.group("day");
            String month = marcher.group("month");
            String year = marcher.group("year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
