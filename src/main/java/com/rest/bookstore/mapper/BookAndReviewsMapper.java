package com.rest.bookstore.mapper;

import com.rest.bookstore.dto.BookAndReviewsDTO;
import com.rest.bookstore.dto.ReviewsDTO;
import com.rest.bookstore.entity.BookAndReview;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookAndReviewsMapper {

    public BookAndReviewsDTO bookAndReviewsDTOMapper(BookAndReview bookAndReview)
    {
        return BookAndReviewsDTO.builder()
                .ISBN(bookAndReview.getISBN())
                .bookType(bookAndReview.getBookType())
                .author(bookAndReview.getAuthor())
                .genre(bookAndReview.getGenre())
                .numberOfPages(bookAndReview.getNumberOfPages())
                .price(bookAndReview.getPrice())
                .publisher(bookAndReview.getPublisher())
                .title(bookAndReview.getTitle())
                .weight(bookAndReview.getWeight())
                .reviewsDTO(bookAndReview.getReviews().stream()
                        .map(bookAndReview1 -> ReviewsDTO.builder()
                                .reviewDescription(bookAndReview1.getReviewDescription())
                                .starRating(bookAndReview1.getStarRating())
                                .build())
                        .collect(Collectors.toList()))
                .build();
    }
}
