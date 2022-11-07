package objectsAndClasses.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {

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
        int n = Integer.parseInt(scanner.nextLine());
        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] article = scanner.nextLine().split(", ");
            Article currArticle = new Article();

            currArticle.setTitle(article[0]);
            currArticle.setContent(article[1]);
            currArticle.setAuthor(article[2]);

            articleList.add(currArticle);
        }
        String input = scanner.nextLine();
        for (Article article: articleList) {
            System.out.printf("%s - %s: %s%n", article.getTitle(), article.getContent(), article.getAuthor());
        }
    }
}
