package com.example.demo.model.dto;

import com.example.demo.Entity.TaiKhoan;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaiKhoanDTO {
    private String tenDangNhap;
    private String quyen;

    public TaiKhoanDTO(TaiKhoan taiKhoan) {
        this.tenDangNhap = taiKhoan.getTenDangNhap();
        this.quyen = taiKhoan.getQuyen().getTenQuyen();
    }

}
