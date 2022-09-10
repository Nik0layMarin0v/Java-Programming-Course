package dataTypesAndVariables.lab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l, w, h = 0;
        System.out.print("Length: ");
        l = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        w = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        h = Double.parseDouble(scanner.nextLine());
        double V = (l * w * h) / 3.0;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
