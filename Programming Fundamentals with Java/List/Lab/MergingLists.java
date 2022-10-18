package lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();
        int minSize = Math.min(secondList.size(), firstList.size());
        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            result.add(firstItem);
            result.add(secondItem);
        }
        if (firstList.size() > secondList.size()) {
            result.addAll(firstList.subList(secondList.size(), firstList.size()));
        } else {
            result.addAll(secondList.subList(firstList.size(), secondList.size()));
        }
        for (int items: result) {
            System.out.print(items + " ");
        }
    }
}
