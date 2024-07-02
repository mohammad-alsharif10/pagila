package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Actor}
 */
public record ActorDto(Integer id, String firstName, String lastName,
                       OffsetDateTime lastUpdate) implements Serializable {
}