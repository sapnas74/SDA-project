package sdaakademija.fundamentals.practicalexercises.booksandauthors;

import sdaakademija.fundamentals.practicalexercises.booksandauthors.Author;

import java.util.List;

public class Book {

    private String title;
    private List<Author> authors;
    private double price;
    private int quantity;

    public Book(String title, List<Author> authors, double price, int quantity) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

