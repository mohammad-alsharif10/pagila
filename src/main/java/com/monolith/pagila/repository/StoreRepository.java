package com.monolith.pagila.repository;

import com.monolith.pagila.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StoreRepository extends JpaRepository<Store, Integer> , JpaSpecificationExecutor<Store> {
  }