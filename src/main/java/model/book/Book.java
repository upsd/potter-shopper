package model.book;

import java.util.Objects;

public class Book {

    private PotterBooks bookInSeries;

    public Book(PotterBooks bookInSeries) {
        this.bookInSeries = bookInSeries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookInSeries == book.bookInSeries;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookInSeries);
    }
}
