import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Book {
    private String author;
    private String title;
    private double price;
    private List<String> reviews;

    public Book(String author, String title, double price) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.reviews = new ArrayList<String>();
    }


    public void addReview(String review) {
        reviews.add(review);
    }
}
