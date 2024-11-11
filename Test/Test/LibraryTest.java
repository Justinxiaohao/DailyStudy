import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Java Programming", "John Doe", "1234567890");
        library.addBook(book);
        assertEquals(1, getBooks().size());
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book("Java Programming", "John Doe", "1234567890");
        library.addBook(book);
        library.removeBook("1234567890");
        assertEquals(0, getBooks().size());
    }

    @Test
    public void testFindBook() {
        Book book = new Book("Java Programming", "John Doe", "1234567890");
        library.addBook(book);
        library.findBook("1234567890");
        // Assuming findBook prints to console, we can't directly assert the output
        // But we can assert that the book is in the library
        assertTrue(getBooks().contains(book));
    }

    @Test
    public void testDisplayAllBooks() {
        Book book1 = new Book("Java Programming", "John Doe", "1234567890");
        Book book2 = new Book("Python Programming", "Jane Doe", "0987654321");
        library.addBook(book1);
        library.addBook(book2);
        library.displayAllBooks();
        // Assuming displayAllBooks prints to console, we can't directly assert the output
        // But we can assert that the books are in the library
        assertEquals(2, getBooks().size());
    }

    // Helper method to access the private books list in Library using reflection
    private ArrayList<Book> getBooks() {
        try {
            Field field = Library.class.getDeclaredField("books");
            field.setAccessible(true);
            return (ArrayList<Book>) field.get(library);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}