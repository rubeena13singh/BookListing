package com.example.android.booklisting;

/**
 * Created by Dell on 6/24/2017.
 */

public class BookList {
    private String bookName;
    private String authorName;
    private String publisher;

    public BookList(String name, String a_name, String publish) {
        this.bookName = name;
        this.authorName = a_name;
        this.publisher = publish;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }
}
