package com.monolith.pagila.entity;

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
@Table(name = "store")
public class Store {
    @Id
    @ColumnDefault("nextval('store_store_id_seq'::regclass)")
    @Column(name = "store_id", nullable = false)
    private Integer id;

    @Column(name = "manager_staff_id", nullable = false)
    private Short managerStaffId;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private OffsetDateTime lastUpdate;

}