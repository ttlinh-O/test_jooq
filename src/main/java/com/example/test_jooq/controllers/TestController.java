package com.example.test_jooq.controllers;

import com.example.test_jooq.entyties.Book;
import com.example.test_jooq.repositories.IBookRepositoryCustomize;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final IBookRepositoryCustomize iBookRepositoryCustomize;

    @GetMapping()
    public Book getBookList() {
        return this.iBookRepositoryCustomize.jooqGetAllBooks();
    }
}
