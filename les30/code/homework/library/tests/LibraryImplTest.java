package homework.library.tests;

import homework.library.dao.Library;
import homework.library.dao.LibraryImpl;
import homework.library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {
    Library library;

    Book [] b;

    @BeforeEach
    void setUp() {
        library = new LibraryImpl(10);
        b = new Book[4];
        b[0] = new Book(12345L,"Jan","12345",2021);



        for (int i = 0; i < b.length; i++) {      // добавляем в библиотеку
            library.addBook(b[i]);
        }


    }


    @Test
    void addBook() {
        // не можем добавить null
        assertFalse(library.addBook(null));
        // не можем добавить второй раз уже существующий
        assertFalse(library.addBook(b[1]));

        Book book1=new Book(5432111, "Анатолий", "Женщины - цветы для нашей жизни", 2023) {
        };
        assertTrue(library.addBook(book1));// добавили новую книгу
        assertEquals(5,library.quantitybooks()); // теперь вcего 5 книг
        Book book2=new Book(3333333, "Евгений Мильковский", "Как зарождались Нервы", 2021) {
        };
        assertFalse(library.addBook(book2));// проверка на то что мы не можем увеличить capacity общее количество


    }

    @Test
    void removeBook() {
     library.printBooks();
        assertEquals(b[0],library.removeBook(12345L));
        System.out.println("_______________________________________");
        library.printBooks();
    }

    @Test
    void findBook() {
        assertEquals(b[3],library.findBook(100L));
    }

    @Test
    void quantitybooks() {
    }

    @Test
    void printbooks() {

    }
}