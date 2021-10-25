package com.example.bookshop.service;

import com.example.bookshop.data.BookRepository;
import com.example.bookshop.model.Book;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public void save(Book book) {
        bookRepository.save(book);
    }
}
