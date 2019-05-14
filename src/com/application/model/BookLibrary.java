package com.application.model;

import java.util.List;

public class BookLibrary {
    private List<Book> allBook;
    private Book getFirstBook;

    public List<Book> getAllBook() {
        return allBook;
    }

    public void setAllBook(List<Book> allBook) {
        this.allBook = allBook;
    }

    public Book getGetFirstBook() {
        return getFirstBook;
    }

    public void setGetFirstBook(Book getFirstBook) {
        this.getFirstBook = getFirstBook;
    }

}
