package lists.moreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double savings = Double.parseDouble(scanner.nextLine());
        List<Integer> drumsQuality = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> drumsDamage = new ArrayList<>();
        for (int i = 0; i < drumsQuality.size(); i++) {
            drumsDamage.add(drumsQuality.get(i));
        }

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int damage = Integer.parseInt(input);
            for (int i = 0; i < drumsDamage.size(); i++) {
                int currentQuality = drumsDamage.get(0) - damage;
                if (currentQuality <= 0) {
                    if (savings - drumsQuality.get(i) * 3 >= 0) {
                        drumsDamage.add(drumsQuality.get(i));
                        savings -= drumsQuality.get(i) * 3;
                    } else {
                        drumsQuality.remove(i);
                        i--;
                    }
                } else {
                    drumsDamage.add(currentQuality);
                }
                drumsDamage.remove(0);
            }


            input = scanner.nextLine();
        }

        for (int i = 0; i < drumsDamage.size(); i++) {
            System.out.print(drumsDamage.get(i) + " ");
        }
        System.out.printf("%nGabsy has %.2flv.", savings);
    }
}
