package com.rest.bookstore.controller;

import com.rest.bookstore.dto.BookAndReviewsDTO;
import com.rest.bookstore.entity.BookAndReview;
import com.rest.bookstore.service.BooksAndReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("bookAndReviews")
public class BookAndReviewsController {

    private final BooksAndReviewService booksAndReviewService;

    @GetMapping("/bookAndReviews/{ISBN}")
    public BookAndReview getBookAndReviews(@PathVariable String ISBN){
        return booksAndReviewService.getBookAndReviews(ISBN);
    }

    @GetMapping("/bookAndReviewsDTO/{ISBN}")
    public BookAndReviewsDTO getBookByISBNWithReviews(@PathVariable String ISBN){
        return booksAndReviewService.getBookByISBNWithReviews(ISBN);
    }
}
