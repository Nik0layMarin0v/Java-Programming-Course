package associativeArrays.exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" -> ");

        Map<String, List<String>> companyEmployees = new LinkedHashMap<>();
        while (!command[0].equals("End")) {
            String company = command[0];
            String id = command[1];


            if (companyEmployees.containsKey(company)) {
                if (companyEmployees.get(company).contains(id)) {
                    command = scanner.nextLine().split(" -> ");
                    continue;
                }
            } else {
                companyEmployees.put(company, new ArrayList<>());
            }
            companyEmployees.get(company).add(id);

            command = scanner.nextLine().split(" -> ");
        }
        for (Map.Entry<String, List<String>> entry : companyEmployees.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().forEach(e -> System.out.printf("-- %s%n", e));
        }

    }
}
