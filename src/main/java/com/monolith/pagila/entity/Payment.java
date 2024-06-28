package com.monolith.pagila;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
@Entity
@Table(name = "payment")
public class Payment {
    @ColumnDefault("nextval('payment_payment_id_seq'::regclass)")
    @Column(name = "payment_id", nullable = false)
    private Integer paymentId;

    @Column(name = "customer_id", nullable = false)
    private Short customerId;

    @Column(name = "staff_id", nullable = false)
    private Short staffId;

    @Column(name = "rental_id", nullable = false)
    private Integer rentalId;

    @Column(name = "amount", nullable = false, precision = 5, scale = 2)
    private BigDecimal amount;

    @Column(name = "payment_date", nullable = false)
    private OffsetDateTime paymentDate;

}