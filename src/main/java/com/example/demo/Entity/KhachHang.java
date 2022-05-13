package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "KHACHHANG")
@Data
public class KhachHang {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAKH")
    private Integer makh;
    @Basic(optional = false)
    @Column(name = "SDT")
    private String sdt;
    @Basic(optional = false)
    @Column(name = "HOTEN")
    private String hoten;
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "DIACHI")
    private String diachi;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "makh")
    private Collection<DonGiaoHang> donGiaoHangCollection;
    @JoinColumn(name = "TENDANGNHAP", referencedColumnName = "TENDANGNHAP")
    @OneToOne(optional = false)
    private TaiKhoan tendangnhap;

    public KhachHang() {
    }

    public KhachHang(Integer makh) {
        this.makh = makh;
    }

    public KhachHang(Integer makh, String sdt, String hoten, String diachi) {
        this.makh = makh;
        this.sdt = sdt;
        this.hoten = hoten;
        this.diachi = diachi;
    }
    public void copyKH(KhachHang kh){
        this.sdt = kh.sdt;
        this.hoten = kh.hoten;
        this.diachi = kh.diachi;
        this.email = kh.email;
    }

    public Integer getMakh() {
        return makh;
    }

    public void setMakh(Integer makh) {
        this.makh = makh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Collection<DonGiaoHang> getDonGiaoHangCollection() {
        return donGiaoHangCollection;
    }

    public void setDonGiaoHangCollection(Collection<DonGiaoHang> donGiaoHangCollection) {
        this.donGiaoHangCollection = donGiaoHangCollection;
    }

    public TaiKhoan getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(TaiKhoan tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (makh != null ? makh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof KhachHang)) {
            return false;
        }
        KhachHang other = (KhachHang) object;
        if ((this.makh == null && other.makh != null) || (this.makh != null && !this.makh.equals(other.makh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.KhachHang[ makh=" + makh + " ]";
    }

}
