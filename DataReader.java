// DataReader.java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<Mention> readData(String filename) {
        List<Mention> mentions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(","); // Assuming comma-separated values
                if (parts.length == 3) {
                    String keyword = parts[0];
                    int count = Integer.parseInt(parts[1]);
                    String url = parts[2];
                    mentions.add(new Mention(keyword, count, url));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return mentions;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6be51eb (Add MentionAnalyzer Java files)
