package associativeArrays.exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> registrationsMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split(" ");
            String username = inputArr[1];
            if (inputArr[0].equals("register")) {
                String plateNumber = inputArr[2];
                if (registrationsMap.containsKey(username)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", registrationsMap.get(username));
                } else {
                    registrationsMap.put(username, plateNumber);
                    System.out.printf("%s registered %s successfully%n", username, plateNumber);
                }
            } else {
                if (registrationsMap.containsKey(username)) {
                    registrationsMap.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                } else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
            }
        }

        registrationsMap.entrySet().forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));
    }
}
