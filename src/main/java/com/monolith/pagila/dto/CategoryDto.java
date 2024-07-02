package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Category}
 */
public record CategoryDto(Integer id, String name, OffsetDateTime lastUpdate) implements Serializable {
}