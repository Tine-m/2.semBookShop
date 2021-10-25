package com.example.bookshop.data;

import com.example.bookshop.model.Book;

import java.util.List;

public interface BookRepository {

    public List<Book> findAll();

    public void save(Book book);
}
