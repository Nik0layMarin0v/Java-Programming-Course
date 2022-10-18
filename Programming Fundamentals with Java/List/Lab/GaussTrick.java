package lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int incrementations = nums.size();
        for (int i = 0; i < incrementations / 2; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size() - 1));
            nums.remove(nums.size() - 1);
        }
        for (int items: nums) {
            System.out.print(items + " ");
        }
    }
}
