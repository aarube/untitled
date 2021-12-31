public class Book {
    private final String name;
    private final String author;
    private final int countPage;
    private final String ISBN;

    public Book(String name, String author, int countPage, String ISBN) {
        this.name = name;
        this.author = author;
        this.countPage = countPage;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountPage() {
        return countPage;
    }

    public String getISBN() {
        return ISBN;
    }
}
