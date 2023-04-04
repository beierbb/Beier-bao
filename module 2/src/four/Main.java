package four;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
// Assignment: write code using what we learned in class about using Sets to count how many unique words there are.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();

//        import the text file and change it to only lower case words
        Scanner scanner = new Scanner(new File("C:\\Users\\2655708\\Downloads\\illiad.txt"));
        while (scanner.hasNext()) {
            String text = scanner.nextLine().toLowerCase().replaceAll("\\p{P}", "");
            lines.add(text);
        }
//        split the lines into words and count the unique words
        String[] words = null;
        for (int i = 0 ; i<13393 ; i++){
            String line = lines.get(i);
            words = line.split(" ");
        }
        HashSet<String> wordSet = new HashSet<>(List.of(words));
        System.out.println("Unique words: " + wordSet.size());

    }
}
