package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.City}
 */
public record CityDto(Integer id, String city, CountryDto country, OffsetDateTime lastUpdate) implements Serializable {
}