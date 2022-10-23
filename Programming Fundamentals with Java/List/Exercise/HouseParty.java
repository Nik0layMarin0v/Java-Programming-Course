package lists.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String name = input.split(" ")[0];
            if (input.contains("not")) {
                if (names.contains(name)) {
                    names.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            } else {
                if (names.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    names.add(name);
                }
            }
        }

        names.forEach(e -> System.out.println(e));
    }
}
