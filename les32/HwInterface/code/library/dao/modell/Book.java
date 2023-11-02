package library.dao.modell;


// Шаг 1 - повторите самостоятельно все те шаги, которые мы делали в классе на примере класса Book и интерфейса Library.
//
//        создаем класс Book c полями ISBN, автор, название книги, год издания;
//        создаем интерфейс Library с методами:
//        добавить книгу;
//        удалить книгу;
//        найти книгу;
//        кол-во книг;
//        напечатать список книг.
//        создаем класс LibraryImpl, который implements Library;
//        создаем класс LibraryImplTest, в котором создаем тесты для вышеперечисленных методов.
public class Book {
    public long ISBN;

    public String author;

     public String title;

     public  int years;

    public Book(long ISBN, String author, String title, int years) {
        this.ISBN = ISBN;
        this.author = author;
        this.title = title;
        this.years = years;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
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

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Book book = (Book) object;

        return ISBN == book.ISBN;
    }

    @Override
    public int hashCode() {
        return (int) (ISBN ^ (ISBN >>> 32));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", years=" + years +
                '}';
    }
}

