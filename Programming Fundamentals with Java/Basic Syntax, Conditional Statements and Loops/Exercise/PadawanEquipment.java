package basicSyntaxConditionalStatementsAndLoops.exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double lightsabers = priceOfLightsabers * Math.ceil(countOfStudents * 1.1);
        double robes = priceOfRobes * countOfStudents;
        double belts = priceOfBelts * (countOfStudents - countOfStudents / 6);

        double sum = lightsabers + robes + belts;
        if (sum <= amountOfMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - amountOfMoney);
        }
    }
}
