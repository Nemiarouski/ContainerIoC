package com.hm3.main.repository;

import com.hm3.main.api.repository.BookRepository;

@Component
public class BookRepositoryImpl implements BookRepository {

    @Value(value = "my.param.db")
    private String databaseUrl;

    public void printUrl() {
        System.out.println(databaseUrl);
    }
}