package com.mertakl.readservice.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient("library-service")
public interface LibraryClient {
    @GetMapping("/librarys")
    Map<String, String> getLibraryList();
}


