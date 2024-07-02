package com.monolith.pagila.dto;

import com.monolith.pagila.entity.Staff;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link Staff}
 */
public record StaffDto(Integer id, String firstName, String lastName, AddressDto address, String email, StoreDto store,
                       Boolean active, String username, String password, OffsetDateTime lastUpdate,
                       byte[] picture) implements Serializable {
}