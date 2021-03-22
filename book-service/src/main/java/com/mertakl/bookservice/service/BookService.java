package com.mertakl.bookservice.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    private static final List<String> bookList = Arrays.asList("Book1", "Book2", "Book3");

    public static List<String> getBookList() {
        return bookList;
    }
}

