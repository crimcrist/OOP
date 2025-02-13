import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat penulis
        Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");

        // Membuat buku
        Book book1 = new Book("Java Programming", "123456789", author1);
        Book book2 = new Book("Clean Code", "987654321", author2);

        // Membuat perpustakaan
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        // Membuat peminjam
        Borrower borrower = new Borrower("Alice");

        // Peminjaman buku
        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2);

        // Menampilkan buku yang dipinjam
        borrower.displayBorrowedBooks();

        // Mengembalikan buku
        library.returnBook(borrower, book1);

        // Menampilkan kembali daftar buku yang dipinjam
        borrower.displayBorrowedBooks();

        // Menampilkan buku di perpustakaan
        library.displayLibraryBooks();
    }
}

class Author {
    private String name;
    private String bio;

    public Author(String name, String bio) {
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}

class Book {
    private String title;
    private String isbn;
    private Author author;
    private boolean isBorrowed;

    public Book(String title, String isbn, Author author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isBorrowed = false;
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

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrow() {
        this.isBorrowed = true;
    }

    public void returnBook() {
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nISBN: " + isbn + "\nAuthor: " + author.getName() +
                "\nBio: " + author.getBio() + "\nStatus: " + (isBorrowed ? "Borrowed" : "Available") +
                "\n-------------------------";
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
        System.out.println("\n[INFO] " + name + "'s Borrowed Books:");
        if (borrowedBooks.isEmpty()) {
            System.out.println("[INFO] No books borrowed.");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }
}

class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("[INFO] Book added to library: " + book.getTitle());
        System.out.println("-------------------------");
    }

    public void borrowBook(Borrower borrower, Book book) {
        if (books.contains(book) && !book.isBorrowed()) {
            book.borrow();
            borrower.borrowBook(book);
            System.out.println("[INFO] " + borrower.getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("[WARNING] " + book.getTitle() + " is not available.");
        }
        System.out.println("-------------------------");
    }

    public void returnBook(Borrower borrower, Book book) {
        if (borrower.hasBorrowed(book)) {
            book.returnBook();
            borrower.returnBook(book);
            System.out.println("[INFO] " + borrower.getName() + " returned: " + book.getTitle());
        } else {
            System.out.println("[ERROR] " + borrower.getName() + " did not borrow " + book.getTitle());
        }
        System.out.println("-------------------------");
    }

    public void displayLibraryBooks() {
        System.out.println("\n[INFO] Books in Library:");
        System.out.println("-------------------------");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
