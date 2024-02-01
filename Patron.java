package LibrarySystem;

public class Patron {

    private String name;
    private int libraryCardNumber;

    public Patron(String name, int libraryCardNumber) {
        this.name = name;
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getName() {
        return name;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;}

}
