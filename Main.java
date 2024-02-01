package LibrarySystem;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//Implement a simple program in the `Main` class that demonstrates the usage of the library system.
// You should:
//Create some books and add them to the library.
//Create patrons and issue library cards to them.
//Allow patrons to check out and return books.
//Display the available books and the books checked out by each patron.

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("7 Habits", "Stephen R covey", 2000);
        Book book2 = new Book("Python Basics", "Arshmah", 2024);
        Book book3 = new Book("Tipping Point", "Abdullah", 2023);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Patron patron1 = new Patron("Person 1", 1);
        LibraryCard card1 = new LibraryCard(patron1);

        Patron patron2 = new Patron("Person 2", 2);
        LibraryCard card2 = new LibraryCard(patron2);


        library.checkOut(book1,patron1);

        library.checkOut(book3,patron2);
        library.checkIn(book1,patron1);

        System.out.println("Available books:");
        List<Book> availableBooks = library.listAvailableBooks();
        for (Book book : availableBooks) {
            System.out.println(book.getTitle());
        }

    }
}