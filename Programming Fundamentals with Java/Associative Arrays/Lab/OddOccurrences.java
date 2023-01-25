package associativeArrays.lab;

import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsLine = scanner.nextLine().split(" ");

        Map <String, Integer> wordsCounter = new LinkedHashMap<>();
        for (int i = 0; i < wordsLine.length; i++) {
            String currWord = wordsLine[i].toLowerCase();
            if (!wordsCounter.containsKey(currWord)) {
                wordsCounter.put(currWord, 0);
            }
            int currValue = wordsCounter.get(currWord);
            wordsCounter.put(currWord, currValue + 1);
        }

        List<String> validWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordsCounter.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                validWords.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", validWords));

    }
}
