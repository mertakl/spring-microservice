package com.mertakl.libraryservice.controller;


import com.mertakl.libraryservice.service.LibraryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LibraryController {
    @GetMapping("/librarys")
    public ResponseEntity<Map<String, String>> getBookList(){
        return ResponseEntity.ok(LibraryService.getLibList());
    }
}
