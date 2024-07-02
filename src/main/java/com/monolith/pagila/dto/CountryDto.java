package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Country}
 */
public record CountryDto(Integer id, String country, OffsetDateTime lastUpdate) implements Serializable {
}