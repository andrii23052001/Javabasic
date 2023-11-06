package library.dao;

public class LibraryImpl implements Library {
    Book[] books;

    private int size; // количество книг сейчас


    public LibraryImpl(int capacity) {
        books = new Book[capacity];  //написали здесь размер хранилища для книг

    }

    @Override
    public boolean addBook(Book book) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if (book == null || size == books.length || findBook(book.getIsbn()) != null) {
            return false;
        }
//        books[size] = book; // новый элемент
//        size++;
        books[size++] = book; // ++ - это постфиксная операция
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                Book victim = books[i];
                books[i] = books[size - 1];
                books[size - 1] = null;//
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn() == isbn) {
                return books[i];
            }
        }
        return null;

    }

    @Override
    public int pcsBook() {
        return size;
    }

    @Override
    public void printsBook() {
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }
}
