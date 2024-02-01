//Create a `Book` class with the following attributes:
//        `title` (String)
//        `author` (String)
//        `publicationYear` (int)
//        `isAvailable` (boolean)

package LibrarySystem;
public class Book {
    //private attributes showing encapsulation
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author,int publicationYear){//constructor
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
        isAvailable=true;
    }
    //getter , setter
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
