package homework.library.dao;


import homework.library.model.Book;

/*
создаем интерфейс Library с методами:
        добавить книгу;
        удалить книгу;
        найти книгу;
        кол-во книг;
        напечатать список книг

 */
public interface Library {


    boolean addBook(Book book);// метод по добавлению книгу (вносим в него Обьект Book)

    Book removeBook (long ISBN);

    Book findBook (long ISBN);


    int quantitybooks(); // количество книг

    void printBooks(); // метод который должен печатать список книг

}
