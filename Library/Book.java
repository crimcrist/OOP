public class Book {
    private String title;
    private String isbn;
    private Author author;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public String getBookInfo() {
        return "Title   : " + title + "\n"
             + "ISBN    : " + isbn + "\n"
             + "Author  : " + author.getName() + "\n"
             + "Biography: " + author.getBiography() + "\n"
             + "-------------------------";
    }
}