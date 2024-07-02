package com.monolith.pagila.dto;

import java.io.Serializable;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Store}
 */
public record StoreDto(Integer id, Short managerStaffId, AddressDto address,
                       OffsetDateTime lastUpdate) implements Serializable {
}