package com.example.adrialwalters.booklistingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * An {@link BookAdapter} knows how to create a list item layout for each book
 * in the data source (a list of {@link Book} objects).
 * <p>
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */
public class BookAdapter extends ArrayAdapter<Book> {
    private static final String LOG_TAG = BookAdapter.class.getName();

    /**
     * Constructs a new {@link BookAdapter}.
     *
     * @param context of the app
     * @param books   is the list of books, which is the data source of the adapter
     */
    public BookAdapter(Context context, List<Book> books) {
        super(context, 0, books);
    }

    /**
     * Returns a list item view that displays information about the books.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.book_list, parent, false);
        }

        // Find the book at the given position in the list of books
        Book newBook = getItem(position);

        TextView title = (TextView) listItemView.findViewById(R.id.book_title);
        // Find the TextView with view ID title
        title.setText(newBook.getmTitle());

        TextView authors = (TextView) listItemView.findViewById(R.id.authors);
        // Find the TextView with view ID datePublished
        authors.setText(newBook.getmAuthors());

        return listItemView;
    }
}