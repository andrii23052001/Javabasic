package library.dao;


/*Шаг 1 - повторите самостоятельно все те шаги, которые мы делали в классе на примере класса Book и интерфейса Library.

        создаем класс Book c полями ISBN, автор, название книги, год издания;
        создаем интерфейс Library с методами:
        добавить книгу;
        удалить книгу;
        найти книгу;
        кол-во книг;
        напечатать список книг.
        создаем класс LibraryImpl, который implements Library;
        создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.*/
public interface Library {

    boolean addBook(Book book);

    Book removeBook(long isbn);

    Book findBook(long isbn);

    int pcsBook();

    void printsBook();
}
