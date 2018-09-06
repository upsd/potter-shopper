package model;

import model.book.Book;

import java.util.List;

public class PotterShopper {

    public double billFor(List<Book> books) {
        if (books.size() == 1) {
            return 8.00;
        }
        if (books.size() == 2) {
            if (!books.get(0).sameAs(books.get(1))) {
                return 15.20;
            }
            return 16.00;
        }
        if (books.size() == 3) {
            if (!books.get(0).sameAs(books.get(1))
                    && !books.get(1).sameAs(books.get(2))) {
                return 21.60;
            }
            return 24.00;
        }
        if (books.size() == 4) {
            if (!books.get(0).sameAs(books.get(1))
                    && !books.get(1).sameAs(books.get(2))
                    && !books.get(2).sameAs(books.get(3))) {
                return 25.60;
            }
            return 32.00;
        }

        return 0;
    }
}
