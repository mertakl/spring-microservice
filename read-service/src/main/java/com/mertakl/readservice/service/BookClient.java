package com.mertakl.readservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("book-service")
public interface BookClient {
    @GetMapping("/books")
    List<String> getBookList();
}
