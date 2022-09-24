package arrays.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String[] command = scanner.nextLine().split(" ");
        while (!command[0].equals("end")) {
            byte index1 = 0;
            byte index2 = 0;
            switch (command[0]){
                case "swap":
                    index1 = Byte.parseByte(command[1]);
                    index2 = Byte.parseByte(command[2]);
                    int copy = arr[index1];
                    arr[index1] = arr[index2];
                    arr[index2] = copy;
                    break;
                case "multiply":
                    index1 = Byte.parseByte(command[1]);
                    index2 = Byte.parseByte(command[2]);
                    arr[index1] = arr[index2] * arr[index1];
                    break;
                case "decrease":
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = arr[i] - 1;
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
