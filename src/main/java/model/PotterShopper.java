package model;

import model.book.Book;

import java.util.HashMap;
import java.util.List;

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
        return tryAndApplyDiscountTo(books);
    }

    private double tryAndApplyDiscountTo(List<Book> books) {
        if (areBooksUnique(books) && books.size() > 1) {
            double costOfBooks = PRICE_FOR_ONE_BOOK * books.size();
            double discount = 1 - discounts.get(books.size());

            return costOfBooks * discount;
        }
        return PRICE_FOR_ONE_BOOK * books.size();
    }

    private boolean areBooksUnique(List<Book> books) {
        return books.stream().distinct().count() == books.size();
    }
}
