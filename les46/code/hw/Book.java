package hw;

/*//Задача 2. На основе любого класса из марафона (Book, Computer, Pet, Product, Student):
создать собственный ArrayList;
        добавить в него не менее 6 элементов;
        отсортировать;*/
public class Book  implements  Comparable <Book>{
    private  long isbn;

    private String author;

    private  String title;

    private int year;

    public Book(long isbn, String author, String title, int year) {
        this.isbn = isbn;
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public long getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return Integer.compare(this.year ,o.year);
    }
}
