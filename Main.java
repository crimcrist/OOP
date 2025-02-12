import java.util.ArrayList;
import java.util.List;

class Author {
    private String name;
    private String bio;

    public Author (String name, String bio){
        this.name = name;
        this.bio = bio;
    }

    public String getName (){
        return name;
    }

    public String getBio(){
        return bio;
    }
}

class Book {
    private String title;
    private String isbn;
    private Author author;
    private Boolean isBorrowed;

    public Book(String title, String isbn, Author author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public Author getAuthor(){
        return author;
    }

    public boolean isBorrowed(){
        return isBorrowed;
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook (Book book){
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void borrowBook(Borrower borrower, Book book) {
        if (books.contains(book) && !book.isBorrowed()) {
            book.borrow();
            borrower.borrowBook(book);
            System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Borrower borrower, Book book) {
        if (borrower.hasBorrowed(book)) {
            book.returnBook();
            borrower.returnBook(book);
            System.out.println(borrower.getName() + " returned: " + book.getTitle());
        } else {
            System.out.println("Error: " + borrower.getName() + " did not borrow " + book.getTitle());
        }
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Author: " + book.getAuthor().getName());
                System.out.println("Biography: " + book.getAuthor().getBio());
                System.out.println("------------------------");
            }
        }
    }
}

class Borrower {
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Borrower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    public boolean hasBorrowed(Book book) {
        return borrowedBooks.contains(book);
    }

    public void displayBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("ISBN: " + book.getIsbn());
            System.out.println("Author: " + book.getAuthor().getName());
            System.out.println("Biography: " + book.getAuthor().getBio());
            System.out.println("------------------------");
        }
    }
}

public class Main {

    public Main()
    {
        Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");

        Book book1 = new Book("Java Programming", "123456789", author1);
        Book book2 = new Book("Clean Code", "987654321", author2);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        Borrower borrower = new Borrower("Alice");

        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2);

        borrower.displayBorrowedBooks();

        library.returnBook(borrower, book1);

        borrower.displayBorrowedBooks();
    
        library.displayLibraryBooks();
    }
    
public static void main(String[] args) {
    new Main();
}
}