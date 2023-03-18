package regularExpressions.exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> participants = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        Map<String, Integer> kilometers = new LinkedHashMap<>();
        participants.forEach(e -> kilometers.put(e, 0));

        String data = scanner.nextLine();
        while (!data.equals("end of race")) {
            Pattern letters = Pattern.compile("[A-Z]|[a-z]");
            Matcher lettersMatcher = letters.matcher(data);

            Pattern numbers = Pattern.compile("\\d");
            Matcher numbersMatcher = numbers.matcher(data);

            int distanceToAdd = 0;
            while (numbersMatcher.find()) {
                int currKilometers = Integer.parseInt(numbersMatcher.group());
                distanceToAdd += currKilometers;
            }
            String currentName = "";
            while (lettersMatcher.find()) {
                currentName += lettersMatcher.group();
            }
            if (kilometers.containsKey(currentName)) {
                int currentDistance = kilometers.get(currentName);
                kilometers.put(currentName, currentDistance + distanceToAdd);
            }
            data = scanner.nextLine();
        }

        List<String> nameOfFirstThree = kilometers.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) //сортирам записите по value (дистанция) в намаляващ ред
                .limit(3) //взима първите 3 записа от мап
                .map(entry -> entry.getKey()) //на всеки запис взимам ключ (име на играч)
                .collect(Collectors.toList()); //{"George", "Peter", "Bill"}

        System.out.println("1st place: " + nameOfFirstThree.get(0));
        System.out.println("2nd place: " + nameOfFirstThree.get(1));
        System.out.println("3rd place: " + nameOfFirstThree.get(2));
    }
}
