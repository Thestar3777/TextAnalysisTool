import java.util.Scanner;

public class WordCharFrequency {
    public static void printFrequency(Scanner input, String type) {

        if (type.equalsIgnoreCase("character")) {
            System.out.println("Enter a character: ");
            char charToCheck = input.next().toLowerCase().charAt(0);
            int charFrequency = WordCount.getCharFrequency(charToCheck);
            System.out.println("Frequency of " + charToCheck + " : " + charFrequency);
        }

        else if (type.equalsIgnoreCase("word")) {
            System.out.println("Enter a word: ");
            String wordToCheck = input.next().toLowerCase();
            int wordFrequency = WordCount.getWordFrequency(wordToCheck);
            System.out.println("Frequency of " + wordToCheck + " : " + wordFrequency);
        }
        else {
            System.out.println("Invalid type.");
        }
    }
}