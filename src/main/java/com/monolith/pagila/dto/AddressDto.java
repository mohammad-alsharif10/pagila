package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Address}
 */
public record AddressDto(Integer id, String address, String address2, String district, CityDto city, String postalCode,
                         String phone, OffsetDateTime lastUpdate) implements Serializable {
}