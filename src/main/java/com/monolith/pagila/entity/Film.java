package com.monolith.pagila.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "film")
public class Film {
    @Id
    @ColumnDefault("nextval('film_film_id_seq'::regclass)")
    @Column(name = "film_id", nullable = false)
    private Integer id;

    @Column(name = "title", nullable = false, length = Integer.MAX_VALUE)
    private String title;

    @Column(name = "description", length = Integer.MAX_VALUE)
    private String description;

    @Column(name = "release_year")
    private Integer releaseYear;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "original_language_id")
    private Language originalLanguage;

    @ColumnDefault("3")
    @Column(name = "rental_duration", nullable = false)
    private Short rentalDuration;

    @ColumnDefault("4.99")
    @Column(name = "rental_rate", nullable = false, precision = 4, scale = 2)
    private BigDecimal rentalRate;

    @Column(name = "length")
    private Short length;

    @ColumnDefault("19.99")
    @Column(name = "replacement_cost", nullable = false, precision = 5, scale = 2)
    private BigDecimal replacementCost;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private OffsetDateTime lastUpdate;
    @Column(name = "special_features")
    private List<String> specialFeatures;

/*
 TODO [Reverse Engineering] create field to map the 'rating' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'G'::mpaa_rating")
    @Column(name = "rating", columnDefinition = "mpaa_rating")
    private Object rating;
*/
/*
 TODO [Reverse Engineering] create field to map the 'fulltext' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @Column(name = "fulltext", columnDefinition = "tsvector not null")
    private Object fulltext;
*/
}