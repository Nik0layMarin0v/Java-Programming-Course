package associativeArrays.exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();

        Map<String, List<String>> forceUsers = new LinkedHashMap<>();
        while (!command.equals("Lumpawaroo")) {
            if (command.contains("|")) {
                String side = command.split(" \\| ")[0];
                String user = command.split(" \\| ")[1];

                boolean exist = false;
                for (Map.Entry<String, List<String>> e : forceUsers.entrySet()) {
                    if (e.getValue().contains(user)) {
                        exist = true;
                        break;
                    }
                }

                if (!exist) {
                    forceUsers.putIfAbsent(side, new ArrayList<>());
                    forceUsers.get(side).add(user);
                }


            } else {
                String user = command.split(" -> ")[0];
                String side = command.split(" -> ")[1];

                for (Map.Entry<String, List<String>> e : forceUsers.entrySet()) {
                    if (e.getValue().contains(user)) {
                        e.getValue().remove(user);
                        break;
                    }
                }
                forceUsers.putIfAbsent(side, new ArrayList<>());
                forceUsers.get(side).add(user);
                System.out.printf("%s joins the %s side!%n", user, side);
            }


            command = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> e : forceUsers.entrySet()) {
            if (e.getValue().size() == 0) {
                forceUsers.remove(e);
                continue;
            }
            System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
            e.getValue().forEach(i -> System.out.printf("! %s%n", i));
        }
    }
}
