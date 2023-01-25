package associativeArrays.lab;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numbersCount = new TreeMap<>();
        for (int i = 0; i < input.size(); i++) {
            double currentNum = input.get(i);
            numbersCount.putIfAbsent(currentNum, 0);
            int currentCount = numbersCount.get(currentNum);
            numbersCount.put(currentNum, currentCount + 1);
        }

        numbersCount.entrySet().forEach(e -> System.out.printf("%.0f -> %d%n", e.getKey(), e.getValue()));
    }
}
