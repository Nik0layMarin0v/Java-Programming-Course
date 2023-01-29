package associativeArrays.exercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();

        while (!inputArr[0].equals("buy")) {
            String product = inputArr[0];
            double price = Double.parseDouble(inputArr[1]);
            int quantity = Integer.parseInt(inputArr[2]);

            priceMap.putIfAbsent(product, 0.0);
            priceMap.put(product, price);

            quantityMap.putIfAbsent(product, 0);
            quantityMap.put(product, quantity + quantityMap.get(product));

            inputArr = scanner.nextLine().split(" ");
        }

        List<Double> totalPricesList = new ArrayList<>();
        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            priceMap.put(entry.getKey(), entry.getValue() * quantityMap.get(entry.getKey()));
        }

        priceMap.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
