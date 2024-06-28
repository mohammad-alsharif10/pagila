package com.monolith.pagila.repository;

import com.monolith.pagila.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CountryRepository extends JpaRepository<Country, Integer> , JpaSpecificationExecutor<Country> {
  }