package com.rodrigo.productapi.dto;

import org.springframework.http.HttpStatus;


public record StatusDTO(String message, HttpStatus statusCode) {
}
