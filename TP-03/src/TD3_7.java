import java.util.Scanner;

public class TD3_7 {
    public static void run() {
        System.out.println("TP03.7. Word Finder");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Text: ");
        String text = scanner.nextLine();
        System.out.print("Enter the letter to find in words: ");
        String letter = scanner.nextLine();

        // List of words that contain the letter
        String[] words = text.split("[\\s\\p{Punct}]+");
        String[] words_contain_letter = new String[words.length];
        int count = 0;
        for (String word : words) {
            if (word.contains(letter)) {
                words_contain_letter[count] = word;
                count++;
            }
        }
        System.out.printf("Words that contain letter '%s':\n", letter);
        for (int i = 0; i < count; i++) {
            System.out.printf("| %s", words_contain_letter[i]);
        }
        System.out.println("\nThere are " + count + " words that contain letter '" + letter + "'.");
    }
}
