package objectsAndClasses.exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] phrases = new String[] {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        String[] events = new String[] {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] cities = new String[] {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random rnd = new Random();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            int phrasesRandom = rnd.nextInt(phrases.length);
            String currPhrase = phrases[phrasesRandom];
            int eventsRandom = rnd.nextInt(events.length);
            String currEvent = events[eventsRandom];
            int authorsRandom = rnd.nextInt(authors.length);
            String currAuthor = authors[authorsRandom];
            int citiesRandom = rnd.nextInt(cities.length);
            String currCity = cities[citiesRandom];
            System.out.printf("%s %s %s - %s%n", currPhrase, currEvent, currAuthor, currCity);
        }
    }
}
