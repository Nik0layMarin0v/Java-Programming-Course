package lists.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listOfWagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxPeople = Integer.parseInt(scanner.nextLine());
        String[] commands = scanner.nextLine().split(" ");
        while(!commands[0].equals("end")) {

            switch (commands[0]) {
                case "Add":
                    addition(listOfWagons, commands);
                    break;
                default:
                    fittingPassengers(listOfWagons, commands, maxPeople);
                    break;
            }
            commands = scanner.nextLine().split(" ");
        }
        System.out.println(listOfWagons.toString().replaceAll("[\\[\\],]", ""));
    }

    public static void addition(List<Integer> list, String[] array){
        int wagon = Integer.parseInt(array[1]);
        list.add(wagon);
    }

    public static void fittingPassengers(List<Integer> list, String[] array, int max) {
        int passengers = Integer.parseInt(array[0]);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) + passengers <= max) {
                list.set(i, list.get(i) + passengers);
                return;
            }
        }
    }

}
