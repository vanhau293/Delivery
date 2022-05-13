package com.example.demo.request;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
@Getter
@Setter
public class DangNhapRequest {
    @NotBlank
    private String username;

    @NotBlank
    private String password;

    public DangNhapRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
