package hw;

import java.util.ArrayList;
import java.util.List;

public class BookAppl {
    public static void main(String[] args) {
        List <Book> library= new ArrayList<>();

        library.add(new Book(1,"Jerry Khamton","Love",2000));
        library.add(new Book(2,"Antony Marcos","Why?",1999));
        library.add(new Book(3,"Leon Swarchin","My way",1987));

        System.out.println(library.size());

        System.out.println("Average Sum of "+ averageSumOfISBN(library));


        System.out.println("Is empty?" + library.isEmpty());


        for (Book b:
             library) {
            System.out.println(b);

        }
        System.out.println("SORTED");
       library.sort(Book::compareTo);
        for (Book b:
                library) {
            System.out.println(b);

        }



   }

    public static double averageSumOfISBN(List<Book> library) {
        long totalISBN = 0;
        for (Book book : library) {
            totalISBN += book.getIsbn();
        }
        return (double) totalISBN / library.size();
    }
}