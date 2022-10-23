package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("End")) {
            if (command[0].equals("Add")) {
                numbers.add(Integer.parseInt(command[1]));
            } else if (command[0].equals("Insert")) {
                int index = Integer.parseInt(command[2]);
                if (index < numbers.size() && index >= 0) {
                    int number = Integer.parseInt(command[1]);
                    numbers.add(index, number);
                } else {
                    System.out.println("Invalid index");
                }
            } else if (command[0].equals("Remove")) {
                int index = Integer.parseInt(command[1]);
                if (index < numbers.size() && index >= 0) {
                    numbers.remove(index);
                } else {
                    System.out.println("Invalid index");
                }
            } else {
                int n = Integer.parseInt(command[2]);
                if (command[1].equals("left")) {
                    for (int i = 0; i < n; i++) {
                        int firstNum = numbers.get(0);
                        numbers.remove(0);
                        numbers.add(firstNum);
                    }
                } else {
                    for (int i = 0; i < n; i++) {
                        int lastNum = numbers.get(numbers.size() - 1);
                        numbers.remove(numbers.size() - 1);
                        numbers.add(0, lastNum);
                    }
                }
            }
            command = scanner.nextLine().split(" ");
        }
        numbers.forEach(e -> System.out.print(e + " "));
    }
}
