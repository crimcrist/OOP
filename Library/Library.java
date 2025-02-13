import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> borrowedBooks;

    public Library() {
        books = new ArrayList<>();
        borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to library: " + book.getTitle());
        System.out.println("-------------------------");
    }

    public void borrowBook(Borrower borrower, Book book) {
        if (books.contains(book)){
            books.remove(book);
            borrowedBooks.add(book);
            borrower.borrowBook(book);
            System.out.println(borrower.getName() + " borrowed: " + book.getTitle());
            System.out.println("-------------------------");
        } else {
            System.out.println("Sorry, " + book.getTitle() + " is not available.");
            System.out.println("-------------------------");
        }
    }

    public void returnBook(Borrower borrower, Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            books.add(book);
            borrower.returnBook(book);
            System.out.println(borrower.getName() + " returned: " + book.getTitle());
            System.out.println("-------------------------");
        } else {
            System.out.println("Error: " + book.getTitle() + " was not borrowed.");
            System.out.println("-------------------------");
        }
    }

    public void displayLibraryBooks() {
        System.out.println("Books in Library:");
        System.out.println("-------------------------");
        if (books.isEmpty()) {
            System.out.println("No books available.");
            System.out.println("-------------------------");
            return;
        }
        for (Book book : books) {
            System.out.println(book.getBookInfo());
        }
    }
}
