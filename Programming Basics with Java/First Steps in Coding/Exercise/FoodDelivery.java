package FirstSteps.Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int chickenMenus = Integer.parseInt(scanner.nextLine());
        int fishMenus = Integer.parseInt(scanner.nextLine());
        int vegetarianMenus = Integer.parseInt(scanner.nextLine());

//          • Пилешко меню – 10.35 лв.
//          • Меню с риба – 12.40 лв.
//          • Вегетарианско меню – 8.15 лв.

        double allMenus = chickenMenus * 10.35 + fishMenus * 12.40 + vegetarianMenus * 8.15;
        double dessert = allMenus * 0.2;
        double totalPrice = allMenus + dessert + 2.5;

        System.out.println(totalPrice);

    }
}
