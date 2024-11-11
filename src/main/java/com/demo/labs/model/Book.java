package com.demo.labs.model;


import java.util.Objects;

public class Book {

    private int id;

    private String title;

    private Integer page;

    private String isbn;

    private String description;

    private String language;

    private Double price;

    public Book() {
    }

    public Book(int id, String title, Integer page, String isbn, String description, String language, Double price) {
        this.id = id;
        this.title = title;
        this.page = page;
        this.isbn = isbn;
        this.description = description;
        this.language = language;
        this.price = price;
    }

    public Book(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(title, book.title) && Objects.equals(page, book.page) && Objects.equals(isbn, book.isbn) && Objects.equals(description, book.description) && Objects.equals(language, book.language) && Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, page, isbn, description, language, price);
    }

}
