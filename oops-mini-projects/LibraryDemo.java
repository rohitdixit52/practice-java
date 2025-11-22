
import java.util.*;

class Book{
    private int id;
    private String title;
    private String author;
    private boolean isIssued;

    Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    @Override
public String toString() {
    return id + ". " + title + " by " + author;
}


    public void issueBook(){
        if(!isIssued){
            isIssued = true;
            System.out.println(title + " book is issued");
        }else{
            System.out.println(title + " book is already issued");
        }
    }
     
     public void returnBook(){
        isIssued = false;
        System.out.println(title + "has been returned");
     }

     public boolean isAvailable(){
        return !isIssued;
     }

        public void display() {
        System.out.println(id + ". " + title + " by " + author + (isIssued ? " [Issued]" : " [Available]"));
    }

}

    class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book + " added successfully!");
    }

    public void showAvailableBooks() {
        System.out.println("\nAvailable Books:");
        for (Book b : books) {
            if (b.isAvailable()) b.display();
        }
    }
    
}
public class LibraryDemo {
    public static void main(String[] args) {


        Library lib = new Library();

        Book b1 = new Book(1, "Java Basics", "James Gosling");
       Book b2 = new Book(2, "Effective Java", "Joshua Bloch");
        Book b3 = new Book(3, "Clean Code", "Robert Martin");

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        b1.issueBook();
        lib.showAvailableBooks();

        b1.returnBook();
        lib.showAvailableBooks();
    }
}
