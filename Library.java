package LibrarySystem;
import java.util.ArrayList;
import java.util.List;


//Create a `Library` class to manage books. The `Library` class should have the following methods:
// `addBook(Book book)`: Add a book to the library's collection.
// `removeBook(Book book)`: Remove a book from the library's collection.
// `checkOut(Book book)`: Mark a book as unavailable.
// `checkIn(Book book)`: Mark a book as available.
// `searchByTitle(String title)`: Return a list of books with a matching title.
// `searchByAuthor(String author)`: Return a list of books by a specific author.
// `listAvailableBooks()`: List all available books in the library.
//class Library {




public class Library{
    private List<Book> books;

    public Library() { //constructor for books
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void checkOut(Book book, Patron patron) { //checking out book and exception handling if user is trying to checkout an unavailable book
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("Book checked out: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void checkIn(Book book, Patron patron) {
            book.setAvailable(true);
            System.out.println("Book checked in: " + book.getTitle());

    }

    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> listAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}


