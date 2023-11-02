package homework.library.dao;


import homework.library.model.Book;

public class LibraryImpl implements Library {


    private Book[] books;
    private int pcsBookNow; // количество книг сейчас

    public LibraryImpl(int capacity) {
        books = new Book[capacity]; // capacity - максимальное количество книг

    }

    @Override
    public boolean addBook(Book book) {
        return true;
    }

    @Override
    public Book removeBook(long isbn) {

        for (int i = 0; i < pcsBookNow; i++) {
            if (books[i].getISBN() == isbn) {
                Book victim = books[i];
                books[i] = books[pcsBookNow - 1];// на место найденного поставили последнего кто естi in
                books[pcsBookNow - 1] = null;// ОБНУЛИЛИ ПОСЛЕДНЕГО
                pcsBookNow--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long ISBN) {
        for (int i = 0; i < pcsBookNow; i++) {
            if (books[i].getISBN() == ISBN) {    // нашелся элемент массива у которого совпал id
                return books[i];   // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantitybooks() {
        return 0;
    }

    @Override
    public void printBooks() {
        for (int i = 0; i < pcsBookNow; i++) {
            System.out.println(books[i]);
        }

    }
}