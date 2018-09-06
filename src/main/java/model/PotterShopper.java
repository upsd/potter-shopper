package model;

import model.book.Book;

import java.util.List;

public class PotterShopper {

    public double billFor(List<Book> books) {
        if (books.size() == 1) {
            return 8.00;
        }
        if (books.size() == 2) {
            if (areBooksUnique(books)) {
                return 15.20;
            }
            return 16.00;
        }
        if (books.size() == 3) {
            if (areBooksUnique(books)) {
                return 21.60;
            }
            return 24.00;
        }
        if (books.size() == 4) {
            if (areBooksUnique(books)) {
                return 25.60;
            }
            return 32.00;
        }
        if (books.size() == 5) {
            if (areBooksUnique(books)) {
                return 30.00;
            }
            return 40.00;
        }

        return 0;
    }

    private boolean areBooksUnique(List<Book> books) {
        return books.stream().distinct().count() == books.size();
    }
}
