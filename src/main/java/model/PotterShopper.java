package model;

import model.book.Book;

import java.util.List;

public class PotterShopper {

    public double billFor(List<Book> books) {
        if (books.size() == 1) {
            return 8.00;
        }
        return 0;
    }
}
