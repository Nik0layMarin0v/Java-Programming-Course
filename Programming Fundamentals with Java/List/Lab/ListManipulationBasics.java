package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String[] command = scanner.nextLine().split(" ");
        while(!command[0].equals("end")) {
            switch (command[0]) {
                case "Add":
                    addition(nums, command);
                    break;
                case "Remove":
                    removeElement(nums, command);
                    break;
                case "RemoveAt":
                    removeIndex(nums, command);
                    break;
                case "Insert":
                    insert(nums, command);
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (int element: nums) {
            System.out.print(element + " ");
        }
    }

    public static void addition(List<Integer> list, String[] command) {
        int num = Integer.parseInt(command[1]);
        list.add(num);
    }

    public static void removeElement(List<Integer> list, String[] command) {
        int num = Integer.parseInt(command[1]);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(num)) {
                list.remove(list.get(i));
                return;
            }
        }
    }

    public static void removeIndex(List<Integer> list, String[] command) {
        int index = Integer.parseInt(command[1]);
                list.remove(index);
    }

    public static void insert(List<Integer> list, String[] command) {
        int num = Integer.parseInt(command[1]);
        int index = Integer.parseInt(command[2]);
        list.add(index, num);
    }
}
