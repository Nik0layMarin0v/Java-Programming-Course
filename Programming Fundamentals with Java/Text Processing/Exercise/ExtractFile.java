package textProcessing.exercise;

import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] directory = scanner.nextLine().split("[\\\\.]");

        String name = directory[directory.length - 2];
        String type = directory[directory.length - 1];

        System.out.printf("File name: %s%nFile extension: %s", name, type);
    }
}
