package methods.moreExercises;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String value = scanner.nextLine();

        dataType(type, value);
    }

    public static void dataType(String type, String value) {
        if (type.equals("int")) {
            System.out.println(Integer.parseInt(value) * 2);
        } else if (type.equals("real")) {
            System.out.printf("%.2f%n", Double.parseDouble(value) * 1.5);
        } else {
            System.out.println("$" + value + "$");
        }


    }
}
