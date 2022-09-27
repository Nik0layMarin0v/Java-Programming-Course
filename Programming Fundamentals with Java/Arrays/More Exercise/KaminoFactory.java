package arrays.moreExercise;

import java.util.*;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] command = scanner.nextLine().split("!");

        int counter = 0;
        int arrayNum = 0;
        int curArrayNum = 0;
        int sum = 0;
        int index = 0;
        List<int[]> arraysList = new ArrayList<>();
        while (!command[0].contains("Clone them")) {
            curArrayNum++;
            int newCounter = 1;
            int[] numbers = Arrays.stream(command).mapToInt(Integer::parseInt).toArray();
            arraysList.add(numbers);
            for (int i = 0; i < n; i++) {
                if (numbers[i] == 1) {
                    for (int j = i + 1; j < n; j++) {
                        if (numbers[j] == 1) {
                            newCounter++;
                        } else {
                            break;
                        }
                    }
                    if (newCounter > counter) {
                        counter = newCounter;
                        newCounter = 0;
                        arrayNum = curArrayNum;
                        sum = sum(numbers);
                        index = i;
                    } else if (newCounter == counter) {
                        if (index > i) {
                            counter = newCounter;
                            newCounter = 0;
                            arrayNum = curArrayNum;
                            sum = sum(numbers);
                            index = i;
                        }
                        if (sum < sum(numbers)) {
                            counter = newCounter;
                            newCounter = 0;
                            arrayNum = curArrayNum;
                            sum = sum(numbers);
                            index = i;
                        }
                    }
                }
            }

            command = scanner.nextLine().split("!");
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", arrayNum, sum);
        for (int i = 0; i < n; i++) {
            System.out.print(arraysList.get(arrayNum - 1)[i] + " ");
        }
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
