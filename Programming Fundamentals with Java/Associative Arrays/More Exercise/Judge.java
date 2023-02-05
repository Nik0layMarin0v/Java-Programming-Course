package associativeArrays.moreExercise;

import java.util.*;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> statistic = new LinkedHashMap<>();
        String[] command = scanner.nextLine().split(" -> ");

        while (!command[0].equals("no more time")) {
            String name = command[0];
            String contest = command[1];
            String points = command[2];

            if (!statistic.containsKey(contest)) {
                statistic.put(contest, new ArrayList<>());
                statistic.get(contest).add(String.format("%s=%s", points, name));
            } else {

            }


        }



    }
}
