package com.supplychain.auth_service.dto;

import com.supplychain.auth_service.model.Role;

public record RegisterRequest(String username, String password, Role role) {
}