import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book {
    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int numCopies;

    public Book(int bookId, String title, String author, String publisher, int yearOfPublication, int numCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numCopies = numCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }
}

class Library {
    private List<Book> books = new ArrayList<Book>();

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void issueBook(Book book) {
        book.setNumCopies(book.getNumCopies() - 1);
    }

    public void returnBook(Book book) {
        book.setNumCopies(book.getNumCopies() + 1);
    }

    public void displayBooks() {
        System.out.println("List of Books:");
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId());
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Publisher: " + book.getPublisher());
            System.out.println("Year of Publication: " + book.getYearOfPublication());
            System.out.println("Number of Copies: " + book.getNumCopies());
            System.out.println();
        }
    }

    public void searchBook(String keyword) {
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getAuthor().toLowerCase().contains(keyword.toLowerCase()) ||
                    book.getPublisher().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Book ID: " + book.getBookId());
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Publisher: " + book.getPublisher());
                System.out.println("Year of Publication: " + book.getYearOfPublication());
                System.out.println("Number of Copies: " + book.getNumCopies());
                System.out.println();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the given keyword.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        // add some sample books
        Book book1 = new Book(101, "Java Programming", "John Doe", "ABC Publications", 2010, 5);
       // library.addBook(1243,"hdhdh","dfghjkjhg","sdfghjkj",8596,4,);
        }}
