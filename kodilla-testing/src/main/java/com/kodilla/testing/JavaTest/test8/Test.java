import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Test {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Bruce Eckel", "Thinking in Java", 2004));
        books.add(new Book("Scott Oaks", "Java Performance", 2009));
        books.add(new Book("Maurice Naftalin", "Java generics and collections", 2002));

        OptionalDouble optionalAverage =  books.stream()
                .map(b -> b.getPublicationYear())
                .mapToInt(i -> i)
                .average();
        if (optionalAverage.isPresent()) {
            System.out.println("Average publication year: " + optionalAverage.getAsDouble());
        } else {
            System.out.println("Average can't be computed");
        }
    }
}


class Book {
    private String author;
    private String title;
    private int publicationYear;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.author + ", " + publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}