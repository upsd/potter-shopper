package model;

import model.book.Book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class PotterShopper {

    private static final double PRICE_FOR_ONE_BOOK = 8.00;
    private HashMap<Integer, Double> discounts;

    public PotterShopper() {
        discounts = new HashMap<>();
        discounts.put(2, 0.05);
        discounts.put(3, 0.10);
        discounts.put(4, 0.20);
        discounts.put(5, 0.25);
    }

    public double billFor(List<Book> books) {
        List<Book> toBeDiscounted = getBooksToBeDiscounted(books);
        List<Book> nonDiscountedBooks = getNonDiscountedBooks(books, toBeDiscounted);

        return tryAndApplyDiscountTo(toBeDiscounted) + priceFor(nonDiscountedBooks);
    }

    private List<Book> getNonDiscountedBooks(List<Book> books, List<Book> toBeDiscounted) {
        List<Book> nonDiscountedBooks = new ArrayList<>();
        nonDiscountedBooks.addAll(books);

        toBeDiscounted.forEach(book -> nonDiscountedBooks.remove(book));

        return nonDiscountedBooks;
    }

    private List<Book> getBooksToBeDiscounted(List<Book> books) {
        return books.stream().distinct().collect(Collectors.toList());
    }

    private double priceFor(List<Book> books) {
        return PRICE_FOR_ONE_BOOK * books.size();
    }

    private double tryAndApplyDiscountTo(List<Book> books) {
        if (areBooksUnique(books) && books.size() > 1) {
            double costOfBooks = priceFor(books);
            double discount = 1 - discounts.get(books.size());

            return costOfBooks * discount;
        }
        return priceFor(books);
    }

    private boolean areBooksUnique(List<Book> books) {
        return books.stream().distinct().count() == books.size();
    }
}
