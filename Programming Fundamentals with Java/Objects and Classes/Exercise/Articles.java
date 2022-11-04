package objectsAndClasses.exercise;

import java.util.Scanner;

public class Articles {

    static class Article {
        String title;
        String content;
        String author;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void rename(String newText) {
            this.title = newText;
        }
        public void edit(String newText) {
            this.content = newText;
        }
        public void changeAuthor(String newText) {
            this.author = newText;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] Article = scanner.nextLine().split(", ");
        Article article = new Article();
        article.setTitle(Article[0]);
        article.setContent(Article[1]);
        article.setAuthor(Article[2]);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            if (command[0].equals("Edit")) {
                article.edit(command[1]);
            } else if (command[0].equals("ChangeAuthor")) {
                article.changeAuthor(command[1]);
            } else if (command[0].equals("Rename")) {
                article.rename(command[1]);
            }
        }

        System.out.printf("%s - %s: %s", article.getTitle(), article.getContent(), article.getAuthor());
    }
}
