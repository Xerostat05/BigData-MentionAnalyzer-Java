// Mention.java
public class Mention {
    private String keyword;
    private int count;
    private String url;

    public Mention(String keyword, int count, String url) {
        this.keyword = keyword;
        this.count = count;
        this.url = url;
    }

    public String getKeyword() {
        return keyword;
    }

    public int getCount() {
        return count;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String toString() {
        return "Mention{" +
                "keyword='" + keyword + '\'' +
                ", count=" + count +
                ", url='" + url + '\'' +
                '}';
    }
}
