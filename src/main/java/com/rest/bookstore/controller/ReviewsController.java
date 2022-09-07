package com.rest.bookstore.controller;

import com.rest.bookstore.entity.Reviews;
import com.rest.bookstore.service.ReviewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reviews")
@RequiredArgsConstructor
public class ReviewsController {

    private final ReviewsService reviewsService;

    @GetMapping("/allReviews")
    public List<Reviews> getAllReviews(){
        return reviewsService.getAllReviews();
    }

    @GetMapping("/reviewsByISBN/{ISBN}")
    public List<Reviews> getReviewsByISBN(@PathVariable String ISBN){
        return reviewsService.getReviewByISBN(ISBN);
    }

    @PostMapping("/addReview")
    public void addReview(@RequestBody Reviews review){
        reviewsService.addReview(review);
    }
}
