package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> legendaryItems = new LinkedHashMap<>();
        legendaryItems.put("shards", 0);
        legendaryItems.put("fragments", 0);
        legendaryItems.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();
        boolean isObtained = false;
        while (true) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int i = 0; i < inputLine.length; i += 2) {
                int currentPoints = Integer.parseInt(inputLine[i]);;
                String currentItem = inputLine[i + 1].toLowerCase(Locale.ROOT);
                if (currentItem.equals("shards") || currentItem.equals("fragments") || currentItem.equals("motes")) {
                    legendaryItems.put(currentItem, legendaryItems.get(currentItem) + currentPoints);
                    if (legendaryItems.get(currentItem) >= 250) {
                        if (currentItem.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (currentItem.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }

                        legendaryItems.put(currentItem, legendaryItems.get(currentItem) - 250);
                        isObtained = true;
                        break;
                    }
                } else {
                    junkItems.putIfAbsent(currentItem, 0);
                    junkItems.put(currentItem, junkItems.get(currentItem) + currentPoints);
                }
            }
            if (isObtained) {
                legendaryItems.entrySet().forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
                junkItems.entrySet().forEach(e -> System.out.printf("%s: %d%n", e.getKey(), e.getValue()));
                break;
            }
        }
    }
}
