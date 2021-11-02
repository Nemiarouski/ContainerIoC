package com.hm3.main.service;

import com.hm3.main.api.repository.BookRepository;
import com.hm3.main.api.service.BookService;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public void printUrl() {
        bookRepository.printUrl();
    }
}