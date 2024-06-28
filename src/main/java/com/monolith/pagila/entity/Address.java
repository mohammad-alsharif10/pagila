package com.monolith.pagila;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "address")
public class Address {
    @Id
    @ColumnDefault("nextval('address_address_id_seq'::regclass)")
    @Column(name = "address_id", nullable = false)
    private Integer id;

    @Column(name = "address", nullable = false, length = Integer.MAX_VALUE)
    private String address;

    @Column(name = "address2", length = Integer.MAX_VALUE)
    private String address2;

    @Column(name = "district", nullable = false, length = Integer.MAX_VALUE)
    private String district;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Column(name = "postal_code", length = Integer.MAX_VALUE)
    private String postalCode;

    @Column(name = "phone", nullable = false, length = Integer.MAX_VALUE)
    private String phone;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private OffsetDateTime lastUpdate;

}