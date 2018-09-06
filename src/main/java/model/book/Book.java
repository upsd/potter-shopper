package model.book;

public class Book {

    private PotterBooks bookInSeries;

    public Book(PotterBooks bookInSeries) {
        this.bookInSeries = bookInSeries;
    }

    public boolean sameAs(Book book) {
        return book.bookInSeries == bookInSeries;
    }
}
