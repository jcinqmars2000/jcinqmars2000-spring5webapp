package com.responsiblenrg.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.responsiblenrg.spring5webapp.repositories.BookRepository;

/**
 * Created by jt on 5/18/17.
 */
@Controller
public class BookController {
    
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
