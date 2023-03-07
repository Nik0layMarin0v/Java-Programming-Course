package textProcessing.moreExercise;

import java.util.Scanner;

public class HTML {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String article = scanner.nextLine();

        System.out.println("<h1>");
        System.out.println("  " + title);
        System.out.println("</h1>");

        System.out.println("<article>");
        System.out.println("  " + article);
        System.out.println("</article>");

        String comment = scanner.nextLine();
        while (!comment.equals("end of comments")) {
            System.out.println("<div>");
            System.out.println("  " + comment);
            System.out.println("</div>");

            comment = scanner.nextLine();
        }

    }
}
