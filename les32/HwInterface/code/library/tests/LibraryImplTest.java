package library.tests;

import library.dao.Library;
import library.dao.LibraryImpl;
import library.dao.modell.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



//создаем класс LibraryImpl, который implements Library;
//        создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.

class LibraryImplTest {

    Library library;

    Book[]b;

    @BeforeEach
    void setUp() {
        library=new LibraryImpl(4);
        b= new Book[3];
        b[0]=new Book(12345L,"Royling","Harry Poter",2020);
        b[1]=new Book(123456L,"John","Три товарища",2005);
        b[2]=new Book(54321L,"Andrii Koval","Java для чайников",2023);

        //добавляем элементы массива в library

        for (int i = 0; i < b.length; i++) {
            library.addBook(b[i]);
        }

    }

    @Test
    void addBook() {
        library.printBooks();
        Book booknew1= new Book(65432L,"Shevchenko","Kateryna",1869);
             assertTrue(library.addBook(booknew1));
        System.out.println("Проверяем действительно добавилась ли книга");
        library.printBooks();
        assertEquals(4,library.quantitybooks()); // проверяем ли изменилось количество книг с помощью size. тем самым если на одну книгу больше то метод работает
        System.out.println("=========================================");
        Book booknew2 = new Book(11111L,"Lesya Ukrainka","Беда научит",1891);
        assertFalse(library.addBook(booknew2));// проверка на то что мы не можем добавить книгу така как КАПАСИТИ общая вместимсть 4 книги, в данный момент уже тоже 4 , а 5я книга уже никак не влезет )) хэх и поэтому асертФолс мы и используем
         library.printBooks();
    }

    @Test
    void removeBook() {
        library.printBooks();
        assertEquals(b[0],library.removeBook(12345L));
        System.out.println("Удаляем первую книгу из списка");
        assertEquals(2,library.quantitybooks()); // тест на то что после удаление книгу мы ожидаем на одну меньше , у нас было 3 книг в массиве , одну удалили 2 и ожидаем
        assertNull(library.removeBook(12345L));// дважды не можем удалить
        library.printBooks();

    }

    @Test
    void findBook() {
        assertEquals(b[1],library.findBook(123456L));
        System.out.println("-----------------------------");
       library.printBooks();
    }

    @Test
    void quantitybooks() {
        assertEquals(3,library.quantitybooks());
    }

    @Test
    void printBooks() {
        library.printBooks();
    }
}