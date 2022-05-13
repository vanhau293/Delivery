package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "NHANVIEN")
@Data
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MANV")
    private Integer manv;

    @Column(name = "HOTEN")
    private String hoten;

    @Column(name = "CMND")
    private String cmnd;

    @Column(name = "DIACHI")
    private String diachi;

    @Column(name = "SDT")
    private String sdt;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NGHIVIEC")
    private boolean nghiviec;
    @Column(name = "GPLX")
    private String gplx;
    @Lob
    @Column(name = "HINHANHTAIXE")
    private byte[] hinhanhtaixe;
    @Column(name = "CAMCHAY")
    private Boolean camchay;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manvgh")
    private Collection<Xe> xeCollection;
    @JoinColumn(name = "MABUUCUC", referencedColumnName = "MABUUCUC")
    @ManyToOne(optional = false)
    private BuuCuc mabuucuc;
    @JoinColumn(name = "LOAINV", referencedColumnName = "MALOAINV")
    @ManyToOne(optional = false)
    private LoaiNhanVien loainv;
    @JoinColumn(name = "TENDANGNHAP", referencedColumnName = "TENDANGNHAP")
    @OneToOne(optional = false)
    private TaiKhoan tendangnhap;

    public NhanVien() {
    }

    public NhanVien(Integer manv) {
        this.manv = manv;
    }

    public NhanVien(Integer manv, String hoten, String cmnd, String diachi, String sdt, boolean nghiviec) {
        this.manv = manv;
        this.hoten = hoten;
        this.cmnd = cmnd;
        this.diachi = diachi;
        this.sdt = sdt;
        this.nghiviec = nghiviec;
    }
    public void copyNV(NhanVien s){
        this.hoten = s.hoten;
        this.cmnd = s.cmnd;
        this.diachi = s.diachi;
        this.sdt = s.sdt;
        this.email = s.email;
        this.nghiviec = s.nghiviec;
        this.camchay = s.camchay;
        this.gplx = s.gplx;
        this.hinhanhtaixe = s.hinhanhtaixe;
    }
    public Integer getManv() {
        return manv;
    }

    public void setManv(Integer manv) {
        this.manv = manv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getNghiviec() {
        return nghiviec;
    }

    public void setNghiviec(boolean nghiviec) {
        this.nghiviec = nghiviec;
    }

    public String getGplx() {
        return gplx;
    }

    public void setGplx(String gplx) {
        this.gplx = gplx;
    }

    public byte[] getHinhanhtaixe() {
        return hinhanhtaixe;
    }

    public void setHinhanhtaixe(byte[] hinhanhtaixe) {
        this.hinhanhtaixe = hinhanhtaixe;
    }

    public Boolean getCamchay() {
        return camchay;
    }

    public void setCamchay(Boolean camchay) {
        this.camchay = camchay;
    }

    public Collection<Xe> getXeCollection() {
        return xeCollection;
    }

    public void setXeCollection(Collection<Xe> xeCollection) {
        this.xeCollection = xeCollection;
    }

    public BuuCuc getMabuucuc() {
        return mabuucuc;
    }


    public LoaiNhanVien getLoainv() {
        return loainv;
    }

    public TaiKhoan getTendangnhap() {
        return tendangnhap;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manv != null ? manv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NhanVien)) {
            return false;
        }
        NhanVien other = (NhanVien) object;
        if ((this.manv == null && other.manv != null) || (this.manv != null && !this.manv.equals(other.manv))) {
            return false;
        }
        return true;
    }



}
