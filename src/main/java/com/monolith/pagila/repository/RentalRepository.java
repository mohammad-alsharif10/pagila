package com.monolith.pagila.repository;

import com.monolith.pagila.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RentalRepository extends JpaRepository<Rental, Integer> , JpaSpecificationExecutor<Rental> {
  }