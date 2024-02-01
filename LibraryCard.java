package LibrarySystem;
//Create a `LibraryCard` class that represents a library card issued to a patron.
//It should have an attribute `patron` of type `Patron`.
public class LibraryCard {

    private Patron patron;

    public LibraryCard(Patron patron) {
        this.patron = patron;
    }

    public Patron getPatron() {
        return patron;

    }
}
