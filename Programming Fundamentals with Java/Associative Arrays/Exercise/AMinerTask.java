package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String material = scanner.nextLine();
        Map<String, Integer> resourceMap = new LinkedHashMap<>();

        while (!material.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (resourceMap.containsKey(material)) {
                int curVal = resourceMap.get(material);
                resourceMap.put(material, curVal + quantity);
            } else {
                resourceMap.put(material, quantity);
            }
            material = scanner.nextLine();
        }

        resourceMap.entrySet().forEach(e -> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));
    }
}
