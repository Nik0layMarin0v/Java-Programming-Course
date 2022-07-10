package FirstSteps.Exercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int diluent = Integer.parseInt(scanner.nextLine());
        int workingHours = Integer.parseInt(scanner.nextLine());

//           Предпазен найлон - 1.50 лв. за кв. метър
//           Боя - 14.50 лв. за литър
//           Разредител за боя - 5.00 лв. за литър

        double materialsSum = ((nylon + 2) * 1.5) + ((1.1 * paint) * 14.50) + (diluent * 5.0) + 0.4;
        double workersPrice = materialsSum * 0.3 * workingHours;

        double totalSum = materialsSum + workersPrice;

        System.out.println(totalSum);

    }
}
