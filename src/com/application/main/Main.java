package com.application.main;

import com.application.model.Book;
import com.application.model.BookLibrary;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args){
        AbstractApplicationContext context= new ClassPathXmlApplicationContext("Beans.xml");
        BookLibrary bookLibrary = context.getBean("bookLibrary",BookLibrary.class);
        List<Book> allBook = bookLibrary.getAllBook();
        for(Book book :allBook){
            System.out.println(book.getBookId()+"\t"+book.getBookName());
        }

        System.out.println("---------------------------------------------------");

        Book book = bookLibrary.getGetFirstBook();
        System.out.println(book.getBookId()+"\t"+book.getBookName());

        context.close();
    }
}
