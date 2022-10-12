package methods.exercise;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] commands = scanner.nextLine().split(" ");

        while (!commands[0].equals("end")) {
            switch (commands[0]) {
                case "exchange":
                    exchange(nums, commands);
                    break;
                case "max":
                    max(nums, commands);
                    break;
                case "min":
                    min(nums, commands);
                    break;
                case "first":
                    first(nums, commands);
                    break;
                case "last":
                    last(nums, commands);
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        finalPrint(nums);
    }
    public static void exchange(int[] nums, String[] commands) {
        int index = Integer.parseInt(commands[1]);
        if (index + 1 > nums.length) {
            System.out.println("Invalid index");
            return;
        } else if (index + 1 == nums.length) {
            return;
        }
        int[] leftArray = new int[index + 1];
        int[] rightArray = new int[nums.length - (index + 1)];

        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = nums[index + 1 + i];
        }
        for (int i = 0; i <= index; i++) {
            leftArray[i] = nums[i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            nums[i] = rightArray[i];
        }
        for (int i = 0; i < leftArray.length; i++) {
            nums[rightArray.length + i] = leftArray[i];
        }

    }

    public static void max(int[] nums, String[] commands) {
        if (commands[1].equals("odd")) {
            boolean available = false;
            int biggestOdd = MIN_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(nums[i]) % 2 == 1 && nums[i] >= biggestOdd) {
                    biggestOdd = nums[i];
                    available = true;
                    index = i;
                }
            }
            if (available) {
                System.out.println(index);
            } else {
                System.out.println("No matches");
            }
        } else if (commands[1].equals("even")) {
            boolean available = false;
            int biggestEven = MIN_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(nums[i]) % 2 == 0 && nums[i] >= biggestEven) {
                    biggestEven = nums[i];
                    available = true;
                    index = i;
                }
            }
            if (available) {
                System.out.println(index);
            } else {
                System.out.println("No matches");
            }
        }
    }

    public static void min(int[] nums, String[] commands) {
        if (commands[1].equals("odd")) {
            boolean available = false;
            int smallestOdd = MAX_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(nums[i]) % 2 == 1 && nums[i] < smallestOdd) {
                    smallestOdd = nums[i];
                    available = true;
                    index = i;
                }
            }
            if (available) {
                System.out.println(index);
            } else {
                System.out.println("No matches");
            }
        } else if (commands[1].equals("even")) {
            boolean available = false;
            int smallestEven = MAX_VALUE;
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(nums[i]) % 2 == 0 && nums[i] < smallestEven) {
                    smallestEven = nums[i];
                    available = true;
                    index = i;
                }
            }
            if (available) {
                System.out.println(index);
            } else {
                System.out.println("No matches");
            }
        }
    }

    public static void first(int[] nums, String[] commands) {
        int index = Integer.parseInt(commands[1]);
        if (index > nums.length) {
            System.out.println("Invalid count");
            return;
        }
        if (commands[2].equals("odd")) {
            int[] firstOdd = new int[index];
            int counter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(nums[i]) % 2 == 1) {
                    firstOdd[counter] = nums[i];
                    counter++;
                }
                if (counter == index) {
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("[]");
                return;
            } else {
                System.out.print("[");
                for (int i = 0; i < counter; i++) {
                    if (i == counter - 1) {
                        System.out.println(firstOdd[i] + "]");
                    } else{
                        System.out.print(firstOdd[i] + ", ");
                    }
                }
            }
        } else if (commands[2].equals("even")) {
            int[] firstEven = new int[index];
            int counter = 0;
            for (int i = 0; i < nums.length; i++) {
                if (Math.abs(nums[i]) % 2 == 0) {
                    firstEven[counter] = nums[i];
                    counter++;
                }
                if (counter == index) {
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("[]");
                return;
            } else {
                System.out.print("[");
                for (int i = 0; i < counter; i++) {
                    if (i == counter - 1) {
                        System.out.println(firstEven[i] + "]");
                    } else{
                        System.out.print(firstEven[i] + ", ");
                    }
                }
            }

        }
    }

    public static void last(int[] nums, String[] commands) {
        int index = Integer.parseInt(commands[1]);
        if (index > nums.length) {
            System.out.println("Invalid count");
            return;
        }
        if (commands[2].equals("odd")) {
            int[] lastOdd = new int[index];
            int counter = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (Math.abs(nums[i]) % 2 == 1) {
                    lastOdd[counter] = nums[i];
                    counter++;
                }
                if (counter == index) {
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("[]");
                return;
            } else {
                System.out.print("[");
                for (int i = counter - 1; i >= 0; i--) {
                    if (i == 0) {
                        System.out.println(lastOdd[i] + "]");
                    } else {
                        System.out.print(lastOdd[i] + ", ");
                    }
                }
            }
        } else if (commands[2].equals("even")) {
            int[] lastEven = new int[index];
            int counter = 0;
            for (int i = nums.length - 1; i >= 0; i--) {
                if (Math.abs(nums[i]) % 2 == 0) {
                    lastEven[counter] = nums[i];
                    counter++;
                }
                if (counter == index) {
                    break;
                }
            }
            if (counter == 0) {
                System.out.println("[]");
                return;
            } else {
                System.out.print("[");
                for (int i = counter - 1; i >= 0; i--) {
                    if (i == 0) {
                        System.out.println(lastEven[i] + "]");
                    } else {
                        System.out.print(lastEven[i] + ", ");
                    }
                }
            }
        }
    }

    public static void finalPrint(int[] nums) {
        System.out.print("[");
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                System.out.println(nums[i] + "]");
            } else{
                System.out.print(nums[i] + ", ");
            }
        }
    }
}
