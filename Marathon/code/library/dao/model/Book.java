package library.dao.model;
/*
 Шаг 1 - повторите самостоятельно все те шаги, которые мы делали в классе на примере класса Book и интерфейса Library.

         создаем класс Book c полями ISBN, автор, название книги, год издания;
         создаем интерфейс Library с методами:
         добавить книгу;
         удалить книгу;
         найти книгу;
         кол-во книг;
         напечатать список книг.

*/

public class Book {
    private  long isbn;

    private String author;

    private  String title;

    private int year;

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
