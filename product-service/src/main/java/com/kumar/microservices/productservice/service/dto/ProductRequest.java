package com.kumar.microservices.productservice.service.dto;

import java.math.BigDecimal;

public record ProductRequest(String name, String description, BigDecimal price) {
}