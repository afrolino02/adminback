package com.honestwy.adminback.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.honestwy.adminback.dto.AdminLoginDTO;
import com.honestwy.adminback.dto.AdminRegisterDTO;
import com.honestwy.adminback.dto.AuthResponseDTO;
import com.honestwy.adminback.service.AuthService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService service;

    public AuthController(AuthService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(
            @Valid @RequestBody AdminRegisterDTO dto
    ) throws Exception {
        service.register(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponseDTO> login(
            @Valid @RequestBody AdminLoginDTO dto
    ) throws Exception {

        String token = service.login(dto);
        return ResponseEntity.ok(new AuthResponseDTO(token));
    }
}

