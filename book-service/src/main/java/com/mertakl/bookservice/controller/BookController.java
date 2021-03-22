package com.mertakl.bookservice.controller;


import com.mertakl.bookservice.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public ResponseEntity<List<String>> getBookList() {
        return ResponseEntity.ok(BookService.getBookList());
    }
}

