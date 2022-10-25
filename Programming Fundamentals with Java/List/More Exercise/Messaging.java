package lists.moreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder message = new StringBuilder();

        for (int i = 0; i < numbers.size(); i++) {
            int index = digitSum(numbers.get(i));
//            findTheIndex(index, text);
            if (index > text.length() - 1) {
                int times = index / text.length();
                index -= text.length() * times;
            }


            char characterToAdd = text.charAt(index);
            message.append(characterToAdd);
            text.deleteCharAt(index);
        }

        System.out.println(message);
    }

    public static int digitSum(int num) {
        int sum = 0;

        while(num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }

//    public static void findTheIndex(int index, StringBuilder text) {
//        if (index > text.length() - 1) {
//            index -= text.length();
//            findTheIndex(index, text);
//        }
//    }
}
