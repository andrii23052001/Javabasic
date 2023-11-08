package library.dao.model.tests;

import library.dao.Library;
import library.dao.LibraryImpl;
import library.dao.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryImplTest {

    Library library;

    Book[]b;
    @BeforeEach
    void setUp() {
        library=new LibraryImpl(4);
        b=new Book[3];
        b[0]=new Book(1,"Джеймс Родригесс","Жить или летать",2000);
        b[1]=new Book(2,"Мартин Гарикс","Достучаться до небес",2008);
        b[2]=new Book(3,"Насир Жизнюк","Придти ко мне ",2002);

        for (int i = 0; i < b.length; i++) {
            library.addBook(b[i]);
        }

    }
    @Test
    void addBook() {
        // не можем добавить null - пустой объект
        assertFalse(library.addBook(null));
        // не можем добавить второй раз, уже существующею книгу
        assertFalse(library.addBook(b[1]));
        Book book1=new Book(4,"Джеймс Харингтон","Победить или Умереть",1987);
        assertTrue(library.addBook(book1)); //добавляем книгу
        assertEquals(4,library.pcsBook());//проверяем ли действительно количество изменилось
        Book book2=new Book(4,"Джордан Канни","Сила любви",1988);
        assertFalse(library.addBook(book2));//не может превысить хранилище библиотеки
         library.printsBook();

    }


    @Test
    void removeBook() {
        library.printsBook();
        System.out.println("--------------------------");
        assertEquals(b[0],library.removeBook(1));// удаляем первую книгу
        library.printsBook();
        assertEquals(2,library.pcsBook());// ожидается 2 книги после удаления
        System.out.println("--------------------------------------");
        assertNull(library.findBook(1)); // не можем найти после удаления
        library.printsBook();
    }

    @Test
    void findBook() {
        library.printsBook();
        // ищем книгу по isbn
        assertEquals(b[1], library.findBook(2));
        // ищем несуществующую книгу
        assertNull(library.findBook(5));
    }

    @Test
    void pcsBook() {
        assertEquals(3,library.pcsBook()); //проверям кол-во книг
    }

    @Test
    void printsBook() {
        library.printsBook();
    }


}