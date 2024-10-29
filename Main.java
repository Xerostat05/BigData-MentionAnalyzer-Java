import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String filename = scanner.nextLine();

        // Read the data
        DataReader reader = new DataReader();
        List<Mention> mentions = reader.readData(filename);

        // Sort the data by count
        SortMentions sorter = new SortMentions();
        sorter.sortByCount(mentions);

        // Display the sorted mentions
        System.out.println("Sorted Mentions by Count:");
        for (Mention mention : mentions) {
            System.out.println(mention);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6be51eb (Add MentionAnalyzer Java files)
