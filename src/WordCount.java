import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private final static Map<Character, Integer> charFrequency = new HashMap<>();
    private final static Map<String, Integer> wordFrequency = new HashMap<>();

    public static void printWordCount(Scanner scanner) {
        System.out.println("Enter a paragraph or a lengthy text: ");
        int words = 0;
        int characters = 0;

        try {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) break;
                else if (!line.isBlank()) {
                    words += line.split("\\s+").length;
                }
                characters += line.length();

                for (char c : line.toCharArray()) {
                    if (Character.isLetterOrDigit(c)) {
                        c = Character.toLowerCase(c);
                        charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
                    }
                }
                String[] wordsInLine = line.split("\\s+");
                for (String word : wordsInLine) {
                    word = word.toLowerCase();
                    wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        char mostCommonChar = '\0';
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() > maxFrequency) {
                mostCommonChar = entry.getKey();
                maxFrequency = entry.getValue();
            }
        }
        System.out.println();
        System.out.println("You've entered: ");
        System.out.println(words + " words");
        System.out.println(characters + " characters");

        if (maxFrequency > 0)
            System.out.println(mostCommonChar + " is the most common character.");
        else
            System.out.println("No characters were found in the input.");
    }
    public static int getCharFrequency(char c) {
        return charFrequency.getOrDefault(c, 0);
    }
    public static int getWordFrequency(String word) {
        return wordFrequency.getOrDefault(word.toLowerCase(), 0);
    }
}
