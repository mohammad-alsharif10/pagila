package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Customer}
 */
public record CustomerDto(Integer id, StoreDto store, String firstName, String lastName, String email,
                          AddressDto address, Boolean activebool, LocalDate createDate, OffsetDateTime lastUpdate,
                          Integer active) implements Serializable {
}