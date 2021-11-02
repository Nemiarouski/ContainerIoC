package com.hm3.main.controller;

import com.hm3.main.api.service.BookService;

@Component
public class BookController {

    @Autowired
    private BookService bookService;

    public void printUrl() {
        bookService.printUrl();
    }
}