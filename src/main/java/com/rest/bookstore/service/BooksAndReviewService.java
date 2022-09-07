package com.rest.bookstore.service;

import com.rest.bookstore.dto.BookAndReviewsDTO;
import com.rest.bookstore.entity.BookAndReview;
import com.rest.bookstore.mapper.BookAndReviewsMapper;
import com.rest.bookstore.respository.BookAndReviewsRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BooksAndReviewService {

    private final BookAndReviewsRespository bookAndReviewsRespository;
    private final BookAndReviewsMapper bookAndReviewsMapper;

    public BookAndReview getBookAndReviews(String ISBN){
        return bookAndReviewsRespository.getBookAndReviewByISBN(ISBN);
    }

    public BookAndReviewsDTO getBookByISBNWithReviews(String ISBN){

        return bookAndReviewsMapper.bookAndReviewsDTOMapper(bookAndReviewsRespository.getBookAndReviewByISBN(ISBN));
    }

}
