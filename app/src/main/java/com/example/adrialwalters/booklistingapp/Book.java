package com.example.adrialwalters.booklistingapp;

public class Book {

    /**
     * Title of the book
     */
    private String mTitle;

    /**
     * Author(s) of the book
     */
    private String mAuthors;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title   is the title of the book
     * @param authors is the date when book was published
     */
    public Book(String title, String authors)  {
        mTitle = title;
        mAuthors = authors;
    }

    /**
     * Returns the title of the book
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * Returns the date of when the book was published
     */
    public String getmAuthors() {
        return mAuthors;
    }

}
