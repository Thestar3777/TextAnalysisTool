import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        WordCount.printWordCount(input);

        WordCharFrequency.printFrequency(input, "character");
        WordCharFrequency.printFrequency(input, "word");
    }
}