package com.monolith.pagila.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "country")
public class Country {
    @Id
    @ColumnDefault("nextval('country_country_id_seq'::regclass)")
    @Column(name = "country_id", nullable = false)
    private Integer id;

    @Column(name = "country", nullable = false, length = Integer.MAX_VALUE)
    private String country;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private OffsetDateTime lastUpdate;

}