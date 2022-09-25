package arrays.exercise;

import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] treasureChest = scanner.nextLine().split("\\|");
        String[] command = scanner.nextLine().split(" ");
        boolean empty = false;
        while (!command[0].equals("Yohoho!")) {
            empty = false;
            switch (command[0]) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        boolean contained = false;
                        for (int j = 0; j < treasureChest.length; j++) {
                            if (command[i].equals(treasureChest[j])) {
                                contained = true;
                            }
                        }
                        if (!contained) {
                            String newChest = command[i] + String.join(" ", treasureChest);
                            treasureChest = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(command[1]);
                    if (index < treasureChest.length) {
                        String[] copyLootOrder = new String[treasureChest.length];
                        for (int i = 0; i < treasureChest.length; i++) {
                            copyLootOrder[i] = treasureChest[i];
                        }
                        treasureChest[treasureChest.length - 1] = copyLootOrder[index];
                        for (int i = index; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = copyLootOrder[i + 1];
                        }
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(command[1]);
                    String[] copyLootOrder = new String[treasureChest.length];
                    for (int i = 0; i < treasureChest.length; i++) {
                        copyLootOrder[i] = treasureChest[i];
                    }
                    if (count < treasureChest.length) {
                        treasureChest = new String[copyLootOrder.length - count];
                        for (int i = 0; i < treasureChest.length - 1; i++) {
                            treasureChest[i] = copyLootOrder[i];
                        }
                        for (int i = count; i >= 1; i--) {
                            System.out.print(copyLootOrder[copyLootOrder.length - i] + ", ");
                        }
                    } else {
                        treasureChest = new String[copyLootOrder.length];
                        empty = true;
                    }
                    break;
            }
            command = scanner.nextLine().split(" ");
        }
        if (empty) {
            System.out.println("Failed treasure hunt.");
        } else {
            int sum = 0;
            for (int i = 0; i < treasureChest.length; i++) {
                sum += treasureChest[i].length();
            }
            System.out.printf("Average treasure gain: %,2f pirate credits.", sum / treasureChest.length * 1.0);
        }
    }
}
