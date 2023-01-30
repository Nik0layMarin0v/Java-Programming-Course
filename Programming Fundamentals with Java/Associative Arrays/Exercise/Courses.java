package associativeArrays.exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] courseInfo = scanner.nextLine().split(" : ");
        Map<String, List<String>> registeredUsers = new LinkedHashMap<>();

        while(!courseInfo[0].equals("end")) {
            String courseName = courseInfo[0];
            String user = courseInfo[1];

            registeredUsers.putIfAbsent(courseName, new ArrayList<>());
            registeredUsers.get(courseName).add(user);

            courseInfo = scanner.nextLine().split(" : ");
        }

        for (Map.Entry<String, List<String>> entry : registeredUsers.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
