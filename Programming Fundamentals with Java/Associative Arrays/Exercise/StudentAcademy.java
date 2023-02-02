package associativeArrays.exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> gradesMap = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String currName = scanner.nextLine();
            double currGrade = Double.parseDouble(scanner.nextLine());

            gradesMap.putIfAbsent(currName, new ArrayList<>());
            gradesMap.get(currName).add(currGrade);
        }

        Map<String, Double> validGrades = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : gradesMap.entrySet()) {
            double currentSum = entry.getValue().stream().mapToDouble(Double::doubleValue).sum();
            double average = currentSum / entry.getValue().size();
            if (average >= 4.5) {
                validGrades.put(entry.getKey(), average);
            }
        }
        validGrades.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));
    }
}
