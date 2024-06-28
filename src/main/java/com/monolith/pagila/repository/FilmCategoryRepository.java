package com.monolith.pagila.repository;

import com.monolith.pagila.entity.FilmCategory;
import com.monolith.pagila.entity.FilmCategoryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmCategoryRepository extends JpaRepository<FilmCategory, FilmCategoryId> , JpaSpecificationExecutor<FilmCategory> {
  }