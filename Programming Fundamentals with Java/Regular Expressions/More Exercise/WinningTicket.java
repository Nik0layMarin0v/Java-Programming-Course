package regularExpressions.moreExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WinningTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tickets = scanner.nextLine().split("\\s*,+\\s*");

        char invertedCommas = '"';
        Pattern pattern = Pattern.compile("(?=.{20}).*?(?=(?<ch>[@#$^]))(?<match>\\k<ch>{6,}).*(?<=.{10})\\k<match>.*");

        for (String ticket: tickets) {
            if (ticket.length() != 20) {
                System.out.println("invalid ticket");
            } else {
                Matcher matcher = pattern.matcher(ticket);
                System.out.print("ticket " + invertedCommas + ticket + invertedCommas + " - ");
                if (matcher.matches()) {
                    String ch = matcher.group("ch");
                    String match = matcher.group("match");
                    if (match.length() == 10) {
                        System.out.println("10" + ch + " Jackpot!");
                    } else {
                        System.out.println( match.length() + ch);
                    }
                } else {
                    System.out.println("no match");
                }
            }
        }
    }
}
