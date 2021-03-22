package com.mertakl.readservice.controller;


import com.mertakl.readservice.service.BookClient;
import com.mertakl.readservice.service.LibraryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ReadServiceController {

    private final BookClient bookClient;

    private final LibraryClient libraryClient;

    public ReadServiceController(BookClient bookClient, LibraryClient libraryClient) {
        this.bookClient = bookClient;
        this.libraryClient = libraryClient;
    }

    @GetMapping(path = "/read/{bookName}", produces = "application/json")
    public ResponseEntity<String> getReadingLocation(@PathVariable(value = "bookName") String bookName) {
        String response;
        List<String> bookList = bookClient.getBookList();
        if (bookList.contains(bookName)) {
            Map<String, String> libList = libraryClient.getLibraryList();
            response = "You can read this book - " + bookName + " at this Library - " + libList.get(bookName);
        } else {
            response = "Your Book - " + bookName + " is not currently available in Libaries";
        }
        return ResponseEntity.ok().body(response);
    }
}


