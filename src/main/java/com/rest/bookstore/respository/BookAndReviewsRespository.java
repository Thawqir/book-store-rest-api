package com.rest.bookstore.respository;

import com.rest.bookstore.entity.BookAndReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface BookAndReviewsRespository extends JpaRepository<BookAndReview, String> {

    BookAndReview getBookAndReviewByISBN(@Param("ISBN") String ISBN);
}
