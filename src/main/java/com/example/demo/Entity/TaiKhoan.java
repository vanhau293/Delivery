package com.example.demo.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@Entity
@Table(name = "TAIKHOAN")
@Data
public class TaiKhoan {
    @Id
    @Column(name = "TENDANGNHAP")
    private String tenDangNhap;

    @Column(name = "MATKHAU")
    private String matKhau;


    @ManyToOne
    @JoinColumn(name = "MAQUYEN")
    private Quyen quyen;

    public TaiKhoan(String tenDangNhap, String matKhau, Quyen quyen) {
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }

    public TaiKhoan() {
    }

    public TaiKhoan(TaiKhoan x) {
        this.tenDangNhap = x.getTenDangNhap();
        this.matKhau = x.getMatKhau();
    }
}
