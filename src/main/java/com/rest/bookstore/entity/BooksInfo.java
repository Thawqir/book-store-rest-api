package com.rest.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "BOOKS", schema = "BOOKSTORE")
public class BooksInfo implements Serializable {

    private static final long serialVersionUID = 3L;

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "AUTHOR")
    private String author;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "GENRE")
    private String genre;

    @Column(name = "PUBLISHER")
    private String publisher;

    @Column(name = "NUMBER_OF_PAGES")
    private Integer numberOfPages;

    @Column(name = "WEIGHT")
    private Integer weight;

    @Column(name = "BOOK_TYPE")
    private String bookType;

    @Column(name = "PRICE")
    private Float price;
}
