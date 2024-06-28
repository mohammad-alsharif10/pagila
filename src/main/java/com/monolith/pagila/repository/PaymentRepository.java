package com.monolith.pagila.repository;

import com.monolith.pagila.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface PaymentRepository extends JpaRepository<Payment, Integer> , JpaSpecificationExecutor<Payment> {
  }