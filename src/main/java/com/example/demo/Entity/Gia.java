package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "GIA")
@Data
public class Gia {
    @Id
    @GeneratedValue
    @Column(name = "MAGIA")
    private int magia;
    @ManyToOne
    @JoinColumn(name = "MALOAIGH")
    LoaiGiaoHang loaiGiaoHang;

    @ManyToOne
    @JoinColumn(name = "MANHOMCAN")
    NhomCanNang nhomCanNang;

    @Column(name = "GIAGH")
    private int giagh;

    public Gia() {
    }

    public Gia(int magia, LoaiGiaoHang loaiGiaoHang, NhomCanNang nhomCanNang, int giagh) {
        this.magia = magia;
        this.loaiGiaoHang = loaiGiaoHang;
        this.nhomCanNang = nhomCanNang;
        this.giagh = giagh;
    }

    public int getMagia() {
        return magia;
    }

    public LoaiGiaoHang getLoaiGiaoHang() {
        return loaiGiaoHang;
    }

    public NhomCanNang getNhomCanNang() {
        return nhomCanNang;
    }

    public int getGiagh() {
        return giagh;
    }

    public void setMagia(int magia) {
        this.magia = magia;
    }

    public void setLoaiGiaoHang(LoaiGiaoHang loaiGiaoHang) {
        this.loaiGiaoHang = loaiGiaoHang;
    }

    public void setNhomCanNang(NhomCanNang nhomCanNang) {
        this.nhomCanNang = nhomCanNang;
    }

    public void setGiagh(int giagh) {
        this.giagh = giagh;
    }
}
