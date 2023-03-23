package regularExpressions.moreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantasSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        String message = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\@(?<name>[A-Za-z]+)[^@\\-!:>]*!G!");

        while (!message.equals("end")) {
            StringBuilder decryptedMessage = new StringBuilder();
            for (int i = 0; i < message.length(); i++) {
                int ch = message.charAt(i) - key;
                decryptedMessage.append((char) ch);
            }

            Matcher matcher = pattern.matcher(decryptedMessage.toString());

            if (matcher.find()) {
                String name = matcher.group("name");
                System.out.println(name);
            }

            message = scanner.nextLine();
        }

    }
}
