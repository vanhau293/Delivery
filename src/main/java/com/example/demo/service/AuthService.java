package com.example.demo.service;

import com.example.demo.request.DangNhapRequest;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> authenticateUser(DangNhapRequest loginRequest);
}
