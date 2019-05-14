package com.application.model;

import java.util.List;

public class BookCollection {

    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Book getFirstBook(){
        return getBookList().get(0);
    }


}
