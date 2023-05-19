package com.Shalini;

import com.Shalini.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book book= new Book( 1, "Heal from within" , "Shalini");
        System.out.println(book);
        book.addReview(new Review(1, "Awesome", 5));
        System.out.println(book);
    }

}
