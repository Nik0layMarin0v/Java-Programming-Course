package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsAnAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] letters = scanner.nextLine().toCharArray();
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') {
                continue;
            }
            lettersCount.putIfAbsent(letters[i], 0);
            int currentVal = lettersCount.get(letters[i]);
            lettersCount.put(letters[i], currentVal + 1);
        }
        lettersCount.entrySet().forEach(e -> System.out.printf("%c -> %d%n", e.getKey(), e.getValue()));
    }
}
