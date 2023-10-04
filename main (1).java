import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Word Counter!");
        System.out.println("Choose an option:");
        System.out.println("1. Enter text manually");
        System.out.println("2. Provide a file path");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String text = "";

        if (choice == 1) {
            System.out.println("Enter your text:");
            text = scanner.nextLine();
        } else if (choice == 2) {
            System.out.println("Enter the file path:");
            String filePath = scanner.nextLine();

            try {
                text = readFile(filePath);
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
                System.exit(1);
            }
        } else {
            System.err.println("Invalid choice. Exiting.");
            System.exit(1);
        }
        String[] words = text.split("[\\s\\p{Punct}]+");
        
        
        int wordCount = 0;

        Set<String> stopWords = new HashSet<>(Arrays.asList("the", "and", "in", "to", "of", "a"));

        for (String word : words) {
            
            if (!stopWords.contains(word.toLowerCase())) {
                wordCount++;
            }
        }

        System.out.println("Total word count: " + wordCount);

       
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line).append("\n");
        }

        reader.close();
        return content.toString();
    }
}