package com.hm3.main;

import com.hm3.di.injection.ApplicationContext;
import com.hm3.main.controller.BookController;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ApplicationContext();
        BookController bookController = (BookController) context.getBean(BookController.class);
        bookController.printUrl();
    }
}