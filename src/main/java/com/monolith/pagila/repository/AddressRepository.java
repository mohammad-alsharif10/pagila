package com.monolith.pagila.repository;

import com.monolith.pagila.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AddressRepository extends JpaRepository<Address, Integer> , JpaSpecificationExecutor<Address> {
  }