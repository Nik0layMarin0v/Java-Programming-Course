package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String favoriteBook = scanner.nextLine();
        String book = scanner.nextLine();

        int checkedBooks = 0;
        boolean isNotHere = true;

        while (!book.equals("No More Books")) {
            if (book.equals(favoriteBook)){
                isNotHere = false;
                break;
            }
            book = scanner.nextLine();
            checkedBooks ++;
        }

        if (isNotHere) {
            System.out.printf("The book you search is not here!%nYou checked %d books.", checkedBooks);
        } else {
            System.out.printf("You checked %d books and found it.", checkedBooks);
        }
    }
}
