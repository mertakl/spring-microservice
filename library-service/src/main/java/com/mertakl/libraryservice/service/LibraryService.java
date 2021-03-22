package com.mertakl.libraryservice.service;

import java.util.HashMap;
import java.util.Map;

public class LibraryService {
    private static final Map<String, String> libList;

    static {

        libList = new HashMap<>();

        libList.put("Book1", "Library3");

        libList.put("Book2", "Library1");

        libList.put("Book3", "Library2");
    }

    public static Map<String, String> getLibList() {
        return libList;
    }

}
