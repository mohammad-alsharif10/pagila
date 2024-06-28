package com.monolith.pagila.repository;

import com.monolith.pagila.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> , JpaSpecificationExecutor<Inventory> {
  }