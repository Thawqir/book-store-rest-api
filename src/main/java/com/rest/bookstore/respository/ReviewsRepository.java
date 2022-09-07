package com.rest.bookstore.respository;

import com.rest.bookstore.entity.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {

    @Query(value = "SELECT * FROM BOOKSTORE.REVIEWS", nativeQuery = true)
    List<Reviews> getAllReviews();

    List<Reviews> getReviewsByISBN(String ISBN);
}
