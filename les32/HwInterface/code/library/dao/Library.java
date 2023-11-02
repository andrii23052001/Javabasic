package library.dao;

import library.dao.modell.Book;

// создаем интерфейс Library с методами:
////        добавить книгу;
////        удалить книгу;
////        найти книгу;
////        кол-во книг;
////        напечатать список книг.
public interface Library {

    boolean addBook(Book book);

    Book removeBook(long isbn);

    Book findBook(long isbn);

    int quantitybooks(); // количество книг

    void printBooks(); // метод который должен печатать список книг


}
