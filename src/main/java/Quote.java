import javax.swing.text.StringContent;
import java.io.Serializable;

public class Quote implements Serializable {

    private long id;
    private String content;
    private Author author;

    public Quote(long id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public Quote(){

    }
}
