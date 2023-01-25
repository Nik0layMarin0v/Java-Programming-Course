package associativeArrays.lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map <String, String> synonymsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if(synonymsMap.containsKey(word)) {
                synonym = synonymsMap.get(word) + ", " + synonym;
            }
            synonymsMap.put(word, synonym);
        }
        synonymsMap.entrySet().forEach(e -> System.out.printf("%s - %s%n", e.getKey(), e.getValue()));
    }
}
