package dataTypesAndVariables.moreExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String type ="";

        while (!input.equals("END")){
            boolean isInt = true;
            try {
                int num = Integer.parseInt(input);
            } catch (NumberFormatException e){
                isInt = false;
            }

            boolean isDouble = true;
            try {
                double num = Double.parseDouble(input);
            } catch (NumberFormatException e){
                isDouble = false;
            }

            if (isInt){
                type = "integer";
            } else if (isDouble){
                type = "floating point";
            } else if (input.length() == 1){
                type = "character";
            } else if (input.equalsIgnoreCase("true") || (input.equalsIgnoreCase("false"))){
                type = "boolean";
            } else {
                type = "string";
            }

            System.out.printf("%s is %s type%n", input, type);
            input = scanner.nextLine();
        }

    }
}
