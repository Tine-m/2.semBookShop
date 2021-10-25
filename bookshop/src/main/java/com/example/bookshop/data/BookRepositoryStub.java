package com.example.bookshop.data;

import com.example.bookshop.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookRepositoryStub implements BookRepository {

    private ArrayList<Book> inventory = new ArrayList<Book>(Arrays.asList(
            new Book("Peter Pedal i zoologisk have", 2020, true),
            new Book("1984", 1949, false),
            new Book("Hærværk", 1930, false)));

    @Override
    public List<Book> findAll() {
        return inventory;
    }

    @Override
    public void save(Book book) {
        inventory.add(book);
    }
}
