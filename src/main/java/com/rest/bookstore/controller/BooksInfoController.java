package com.rest.bookstore.controller;

import com.rest.bookstore.entity.BooksInfo;
import com.rest.bookstore.service.BooksInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookInfo")
public class BooksInfoController {

    private final BooksInfoService booksInfoService;

    @GetMapping("/booksInfo")
    public BooksInfo getAllBooks(){
        return booksInfoService.getAllBooks();
    }

    @GetMapping("bookByISBN/{ISBN}")
    public BooksInfo getBookByISBN(@PathVariable String ISBN){
        return booksInfoService.getBookByISBN(ISBN);
    }

//    @GetMapping("/bookByGenre/{genre}")
//    public BooksInfo getBooksByGenre(@PathVariable String genre){
//        return booksInfoService.getBookByGenre(genre);
//    }
}
