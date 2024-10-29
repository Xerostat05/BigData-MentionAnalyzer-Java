import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortMentions {

    public void sortByCount(List<Mention> mentions) {
        mentions.sort((m1, m2) -> Integer.compare(m2.getCount(), m1.getCount())); // Sort by count descending
    }
}
