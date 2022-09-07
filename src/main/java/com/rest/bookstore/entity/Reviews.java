package com.rest.bookstore.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "REVIEWS", schema = "BOOKSTORE")
public class Reviews implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Long id;

    @NaturalId
    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "STAR_RATING")
    private Float starRating;

    @Column(name = "REVIEW_DESCRIPTION")
    private String reviewDescription;
}
