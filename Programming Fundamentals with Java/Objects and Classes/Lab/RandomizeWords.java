package objectsAndClasses.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sentence = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        Random rdn = new Random();
        for (int i = 0; i < sentence.size(); i++) {
            int randomNum = rdn.nextInt(sentence.size());
            System.out.println(sentence.get(randomNum));
            sentence.remove(randomNum);
            i = -1;
        }

    }
}
