package library.dao;

import library.dao.modell.Book;

// создаем класс LibraryImpl, который implements Library;
//        создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.
public class LibraryImpl implements Library {

    private Book[] books; // создали массив где будем хранить все книги
    public  int size;  // текущее количество книг в библиотеке

    public LibraryImpl(int capacity) {
        books = new Book[capacity]; // capacity - максимальный размер компании

    }

    @Override
    public boolean addBook(Book book) {
        // не добавляем null
        // не превышаем capacity, не добавляем уже существующего


        if (book == null || size == books.length || findBook(book.getISBN()) != null) {
            return false;
        }

        books[size] = book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getISBN() == isbn) {
                Book victim = books[i]; //убрали найденный элемент в переменную
                books[i] = books[size - 1]; // на место найденного поставили последнее  // из существ в массиве
                books[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getISBN() == isbn) {    // нашелся элемент массива у которого совпал id
                return books[i];   // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantitybooks() {
        return size;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);

        }

    }
}
