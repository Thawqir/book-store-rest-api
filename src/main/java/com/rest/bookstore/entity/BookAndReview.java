package com.rest.bookstore.entity;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "BOOKS", schema = "BOOKSTORE")
public class BookAndReview implements Serializable {

    private static final long serialVersionUID = 2L;


    @Id
    @Column(name = "ID")
    Integer id;

    @NaturalId
    @Column(name = "ISBN")
    String ISBN;

    @Column(name = "AUTHOR")
    String author;

    @Column(name = "PUBLISHER")
    String publisher;

    @Column(name = "GENRE")
    String genre;

    @Column(name = "NUMBER_OF_PAGES")
    Integer numberOfPages;

    @Column(name = "WEIGHT")
    String weight;

    @Column(name = "PRICE")
    Double price;

    @Column(name = "BOOK_TYPE")
    String bookType;

    @Column(name = "TITLE")
    String title;

    @OneToMany
    @JoinColumn(name = "ISBN",referencedColumnName = "ISBN", insertable = false, updatable = false)
    List<Reviews> reviews;


}
