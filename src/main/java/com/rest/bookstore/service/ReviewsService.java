package com.rest.bookstore.service;

import com.rest.bookstore.entity.BooksInfo;
import com.rest.bookstore.entity.Reviews;
import com.rest.bookstore.respository.ReviewsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewsService {

    private final ReviewsRepository reviewsRepository;

    public List<Reviews> getAllReviews(){
        return reviewsRepository.getAllReviews();
    }

    public List<Reviews> getReviewByISBN(String ISBN) {
        return reviewsRepository.getReviewsByISBN(ISBN);
    }

    public void addReview(Reviews review) {
         reviewsRepository.save(review);
    }
}
