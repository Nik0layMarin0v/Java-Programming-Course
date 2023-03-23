package regularExpressions.moreExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().split("\\|");
        String first = inputArray[0];
        String second = inputArray[1];
        String third = inputArray[2];

        Pattern pattern1 = Pattern.compile("\\w*(?<boarder>[%&$#*])(?<CapitalLetters>[A-Z]+)\\1\\w*");
        Pattern pattern2 = Pattern.compile("\\D*(?<numbers>\\d{2}:\\d{2})\\D*");
//        Pattern pattern3 = Pattern.compile("[ \\|](?<word>[A-Z]\\S+)");

        Matcher matcher1 = pattern1.matcher(first);
        Matcher matcher2 = pattern2.matcher(second);
//        Matcher matcher3 = pattern3.matcher(third);


        Map<Character, Integer> lettersLength = new LinkedHashMap<>();

        while (matcher1.find()) {
            String letters = matcher1.group("CapitalLetters");
            for (int i = 0; i < letters.length(); i++) {
                lettersLength.put(letters.charAt(i), 0);
            }
        }

        while (matcher2.find()) {
            char ch = (char) Integer.parseInt(matcher2.group("numbers").split(":")[0]);
            int length = Integer.parseInt(matcher2.group("numbers").split(":")[1]);

            if (length <= 20) {
                if (lettersLength.containsKey(ch) && lettersLength.get(ch) == 0) {
                    lettersLength.put(ch, length + 1);
                }
            }

        }

//        while (matcher3.find()) {
//            String currentWord = matcher3.group("word");
//
//                if (lettersLength.containsKey(currentWord.charAt(0))) {
//                    int length = lettersLength.get(currentWord.charAt(0));
//                    if (length == currentWord.length()) {
//                        System.out.println(currentWord);
//                        lettersLength.remove(currentWord.charAt(0));
//                    }
//                }
//        }


        String[] words = third.split(" ");
        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];

                if (lettersLength.containsKey(currentWord.charAt(0))) {
                    int length = lettersLength.get(currentWord.charAt(0));
                    if (length == currentWord.length()) {
                        System.out.println(currentWord);
                        lettersLength.remove(currentWord.charAt(0));
                    }
                }
        }
    }
}
