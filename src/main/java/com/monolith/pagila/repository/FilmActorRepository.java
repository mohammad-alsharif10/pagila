package com.monolith.pagila.repository;

import com.monolith.pagila.entity.FilmActor;
import com.monolith.pagila.entity.FilmActorId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface FilmActorRepository extends JpaRepository<FilmActor, FilmActorId> , JpaSpecificationExecutor<FilmActor> {
  }