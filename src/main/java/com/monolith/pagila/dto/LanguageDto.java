package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Language}
 */
public record LanguageDto(Integer id, String name, OffsetDateTime lastUpdate) implements Serializable {
}