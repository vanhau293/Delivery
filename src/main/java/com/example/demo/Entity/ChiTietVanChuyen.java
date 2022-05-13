package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "CHITIETVANCHUYEN")
@Data
public class ChiTietVanChuyen {
    @Id
    @GeneratedValue
    @Column(name = "MACT")
    private int mact;

    @Column(name = "MADON")
    int donGiaoHang;

    @Column(name = "BIENSOXE")
    String xe;
    @Column(name = "TGDI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tgdi;
    @Column(name = "TGDEN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tgden;
    @Basic(optional = false)
    @Column(name = "HUY")
    private boolean huy;
    @JoinColumn(name = "DIEMDI", referencedColumnName = "MABUUCUC")
    @ManyToOne(optional = false)
    private BuuCuc diemdi;
    @JoinColumn(name = "DIEMDEN", referencedColumnName = "MABUUCUC")
    @ManyToOne(optional = false)
    private BuuCuc diemden;
    @JoinColumn(name = "MATRANGTHAI", referencedColumnName = "MATRANGTHAI")
    @ManyToOne(optional = false)
    private TrangThai matrangthai;

    public ChiTietVanChuyen() {
    }


    public ChiTietVanChuyen(int mact, boolean huy) {
        this.mact = mact;
        this.huy = huy;
    }


    public Date getTgdi() {
        return tgdi;
    }

    public void setTgdi(Date tgdi) {
        this.tgdi = tgdi;
    }

    public Date getTgden() {
        return tgden;
    }

    public void setTgden(Date tgden) {
        this.tgden = tgden;
    }

    public boolean getHuy() {
        return huy;
    }

    public void setHuy(boolean huy) {
        this.huy = huy;
    }

    public BuuCuc getDiemdi() {
        return diemdi;
    }

    public void setDiemdi(BuuCuc diemdi) {
        this.diemdi = diemdi;
    }

    public BuuCuc getDiemden() {
        return diemden;
    }

    public void setDiemden(BuuCuc diemden) {
        this.diemden = diemden;
    }

    public void setDonGiaoHang(int donGiaoHang) {
        this.donGiaoHang = donGiaoHang;
    }

    public void setXe(String xe) {
        this.xe = xe;
    }

    public int getDonGiaoHang() {
        return donGiaoHang;
    }

    public String getXe() {
        return xe;
    }

    public TrangThai getMatrangthai() {
        return matrangthai;
    }

    public void setMatrangthai(TrangThai matrangthai) {
        this.matrangthai = matrangthai;
    }


}
