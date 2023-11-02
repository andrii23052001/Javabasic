package homework.library.model;
/*Задча 1. Шаг 1 - повторите самостоятельно все те шаги, которые мы делали в классе на примере класса Book и интерфейса Library.

        создаем класс Book c полями ISBN, автор, название книги, год издания;
        создаем интерфейс Library с методами:
        добавить книгу;
        удалить книгу;
        найти книгу;
        кол-во книг;
        напечатать список книг.
        создаем класс LibraryImpl, который implements Library;
        создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов- /*

 */
public class  Book {

    //создаем класс Book c полями ISBN, автор, название книги, год издания;
    private long isbn; // номер книги

    private  String author; // автор

    private String title; // тайтл название

    private  int year;  // год

    public Book(long isbn, String author, String title, int year) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public long getISBN() {
        return isbn;
    }

    public void setISBN(long ISBN) {
        this.isbn = ISBN;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder("Book").append("ISBN=':").append(isbn).append(", Author='").append(author).append(", title='").append(title).append("\", year=\"").append(year);
     return stringBuilder.toString();
    }
}
