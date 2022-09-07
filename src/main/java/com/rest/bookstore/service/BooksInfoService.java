package com.rest.bookstore.service;

import com.rest.bookstore.entity.BooksInfo;
import com.rest.bookstore.respository.BooksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BooksInfoService {

    private final BooksRepository booksRepository;

    public BooksInfo getAllBooks(){
        return booksRepository.returnAllBooks();
    }

    public BooksInfo getBookByISBN(String ISBN){
        return booksRepository.getBookByISBN(ISBN);
    }

//    public BooksInfo getBookByGenre(String genre){
//        return booksRepository.getBookByGenre(genre);
//    }

}
