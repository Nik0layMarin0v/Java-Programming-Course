package lists.lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] commands = scanner.nextLine().split(" ");

        while(!commands[0].equals("end")) {
            switch (commands[0]) {
                case "Contains":
                    if (containsOrNot(nums, commands)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (commands[1].equals("even")) {
                        printEvenElements(nums);
                    } else if (commands[1].equals("odd")) {
                        printOddElements(nums);
                    }
                    break;
                case "Get":
                    System.out.println(getTheSum(nums));
                    break;
                case "Filter":
                    filtering(nums,commands);
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }


    }
    public static boolean containsOrNot(List<Integer> list, String[] array) {
        int element = Integer.parseInt(array[1]);
        if (list.contains(element)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printEvenElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void printOddElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                System.out.print(list.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static int getTheSum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static void filtering(List<Integer> list, String[] array) {
        String operator = array[1];
        int number = Integer.parseInt(array[2]);
        List<Integer> copy = new ArrayList<>(list);
        if(operator.equals(">")){
            copy.removeIf(n -> n <= number);
        } else if(operator.equals("<")) {
            copy.removeIf(n -> n >= number);
        } else if(operator.equals("<=")) {
            copy.removeIf(n -> n > number);
        } else if(operator.equals(">=")) {
            copy.removeIf(n -> n < number);
        }
        System.out.println(copy.toString().replaceAll("[\\[\\],]", ""));
    }
}
