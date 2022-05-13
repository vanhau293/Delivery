package com.example.demo.controllers;

import com.example.demo.request.DangNhapRequest;
import com.example.demo.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(value = "/login")
public class AuthController {
    @Autowired
    AuthService authService;
    @PostMapping("")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody DangNhapRequest loginRequest) {
        return authService.authenticateUser(loginRequest);
    }
}
