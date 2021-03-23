package com.globant.circuitbreakerreading.controllers;

import com.globant.circuitbreakerreading.srvcs.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CBReadingController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/to-read")
    public String toRead() {
        return bookService.readingList();
    }
}
