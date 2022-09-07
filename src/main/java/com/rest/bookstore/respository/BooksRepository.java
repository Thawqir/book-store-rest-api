package com.rest.bookstore.respository;

import com.rest.bookstore.entity.BooksInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BooksRepository extends JpaRepository<BooksInfo, Long> {

    @Query(value = "SELECT * FROM BOOKSTORE.BOOKS",
            nativeQuery = true)
    BooksInfo returnAllBooks();

    @Query(value = "SELECT * FROM BOOKSTORE.BOOKS WHERE ISBN = :ISBN",
            nativeQuery = true)
    BooksInfo getBookByISBN(String ISBN);

//    @Query(value = "SELECT * FROM BOOKSTORE.BOOKS WHERE GENRE = :GENRE",
//            nativeQuery = true)
//    BooksInfo getBookByGenre(String genre);
}
