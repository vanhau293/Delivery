package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;
import java.util.Collection;

@Entity
@Table(name = "LOAINHANVIEN")
@Data
public class LoaiNhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MALOAINV")
    private Integer maloainv;
    @Column(name = "TENLOAI")
    private String tenloai;

    public LoaiNhanVien() {
    }

    public LoaiNhanVien(Integer maloainv) {
        this.maloainv = maloainv;
    }

    public Integer getMaloainv() {
        return maloainv;
    }

    public void setMaloainv(Integer maloainv) {
        this.maloainv = maloainv;
    }

    public String getTenloai() {
        return tenloai;
    }

    public void setTenloai(String tenloai) {
        this.tenloai = tenloai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maloainv != null ? maloainv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoaiNhanVien)) {
            return false;
        }
        LoaiNhanVien other = (LoaiNhanVien) object;
        if ((this.maloainv == null && other.maloainv != null) || (this.maloainv != null && !this.maloainv.equals(other.maloainv))) {
            return false;
        }
        return true;
    }
}
