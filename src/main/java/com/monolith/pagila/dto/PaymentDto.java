package com.monolith.pagila.dto;

import lombok.Builder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/**
 * DTO for {@link com.monolith.pagila.entity.Payment}
 */
@Builder
public record PaymentDto(Integer paymentId, Short customerId, Short staffId, Integer rentalId, BigDecimal amount,
                         OffsetDateTime paymentDate) implements Serializable {
}