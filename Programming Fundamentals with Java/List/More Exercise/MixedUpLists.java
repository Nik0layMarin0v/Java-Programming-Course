package lists.moreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int n = 0;
        int specialNum1 = 0;
        int specialNum2 = 0;
        if (firstList.size() > secondList.size()) {
            n = secondList.size();
            specialNum1 = firstList.get(n);
            specialNum2 = firstList.get(n + 1);
        } else {
            n = firstList.size();
            specialNum1 = secondList.get(0);
            specialNum2 = secondList.get(1);
        }

        List<Integer> mixedNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            mixedNumbers.add(firstList.get(i));
            mixedNumbers.add(secondList.get(secondList.size() - 1 - i));
        }

        int upperBoarder = Math.max(specialNum1, specialNum2);
        int lowerBoarder = Math.min(specialNum1, specialNum2);

        List<Integer> validNums = new ArrayList<>();
        for (int i = 0; i < mixedNumbers.size(); i++) {
            int currentNum = mixedNumbers.get(i);
            if (currentNum > lowerBoarder && currentNum < upperBoarder) {
                validNums.add(currentNum);
            }
        }

        Collections.sort(validNums);
        for (int i = 0; i < validNums.size(); i++) {
            System.out.print(validNums.get(i) + " ");
        }
    }
}
