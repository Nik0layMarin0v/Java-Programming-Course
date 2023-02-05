package associativeArrays.moreExercise;

import java.util.*;

import static java.lang.Integer.MIN_VALUE;
import static java.util.Collections.reverseOrder;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input1 = scanner.nextLine().split(":");

        Map<String, String> contests = new LinkedHashMap<>();
        while (!input1[0].equals("end of contests")) {
            String contest = input1[0];
            String password = input1[1];
            contests.put(contest, password);
            input1 = scanner.nextLine().split(":");
        }

        String[] input2 = scanner.nextLine().split("=>");

        Map<String, List<String>> results = new TreeMap<>();
        while (!input2[0].equals("end of submissions")) {
            String contest = input2[0];
            String password = input2[1];
            String user = input2[2];
            int points = Integer.parseInt(input2[3]);

            if (contests.containsKey(contest)) {
                if (contests.get(contest).equals(password)) {
                    if (!results.containsKey(user)) {
                        results.put(user, new ArrayList<>());
                        results.get(user).add(String.format("%s -> %s", points, contest));
                    } else {
                        boolean contains = false;
                        for (int i = 0; i < results.get(user).size(); i++) {
                            if (results.get(user).get(i).contains(contest)) {
                                contains = true;
                            }
                        }

                        if (contains) {
                            int currentPoints = 0;
                            for (int i = 0; i < results.get(user).size(); i++) {
                                if (results.get(user).get(i).contains(contest)) {
                                    currentPoints = Integer.parseInt(results.get(user).get(i).split(" -> ")[0]);

                                    if (currentPoints < points) {
                                        results.get(user).remove(i);
                                        results.get(user).add(String.format("%s -> %s", points, contest));
                                    }
                                }
                            }
                        } else {
                            results.get(user).add(String.format("%s -> %s", points, contest));
                        }

                    }
                }
            }


            input2 = scanner.nextLine().split("=>");
        }

        bestPoint(results);
        System.out.println("Ranking:");
        ranking(results);
    }

    public static void bestPoint(Map<String, List<String>> results) {
        Map<String, Integer> pointsList = new TreeMap<>();
        for (int i = 0; i < results.size(); i++) {
            String currentUser = results.entrySet().toArray()[i].toString().split("=")[0];
            int points = 0;
            for (int j = 0; j < results.get(currentUser).size(); j++) {
                int currentPoints = Integer.parseInt(results.get(currentUser).get(j).split(" -> ")[0]);
                points += currentPoints;
            }
            pointsList.put(currentUser, points);
        }

        int maxPoints = MIN_VALUE;
        String maxName = "";
        for (int i = 0; i < pointsList.size(); i++) {
            if (pointsList.get(pointsList.entrySet().toArray()[i].toString().split("=")[0]) > maxPoints) {
                maxPoints = pointsList.get(pointsList.entrySet().toArray()[i].toString().split("=")[0]);
                maxName = pointsList.entrySet().toArray()[i].toString().split("=")[0];
            }
        }

        System.out.printf("Best candidate is %s with total %d points.%n", maxName, maxPoints);
    }

    public static void ranking(Map<String, List<String>> results) {
        for (int i = 0; i < results.size(); i++) {
            String user = results.entrySet().toArray()[i].toString().split("=")[0];
            System.out.println(user);

            Collections.sort(results.get(user));
            Collections.reverse(results.get(user));
            for (int j = 0; j < results.get(user).size(); j++) {
                System.out.printf("#  %s -> %s%n", results.get(user).get(j).split(" -> ")[1], results.get(user).get(j).split(" -> ")[0]);
            }
        }
    }
}
