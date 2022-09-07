package com.rest.bookstore.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookAndReviewsDTO {

    private String ISBN;
    private String author;
    private String publisher;
    private String genre;
    private Integer numberOfPages;
    private String weight;
    private Double price;
    private String bookType;
    private String title;
    private List<ReviewsDTO> reviewsDTO;
}
