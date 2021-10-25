package com.example.bookshop.web;

import com.example.bookshop.data.BookRepositoryStub;
import com.example.bookshop.model.Book;
import com.example.bookshop.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@Controller
public class BookController {

    private BookService bookService = new BookService(new BookRepositoryStub());

    @GetMapping("/show")
    public String showInventory(Model model) {
        List<Book> inventory = bookService.findAll();
        model.addAttribute("books", inventory);
        return "booklist";
    }

    @GetMapping("/create")
    public String createBook(Model model) {
        Book book = new Book();
        model.addAttribute("book", book);
        return "bookForm";
    }

    @PostMapping("/addToList")
    public String saveBook(@ModelAttribute("book") Book book){
        bookService.save(book);
        return "redirect:/show";
    }
}
