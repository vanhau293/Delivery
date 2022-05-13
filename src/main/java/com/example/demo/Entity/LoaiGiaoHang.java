package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "LOAIGIAOHANG")
@Data
public class LoaiGiaoHang {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MALOAIGH")
    private Integer maloaigh;
    @Basic(optional = false)
    @Column(name = "TENLOAIGH")
    private String tenloaigh;

    public LoaiGiaoHang() {
    }

    public LoaiGiaoHang(Integer maloaigh) {
        this.maloaigh = maloaigh;
    }

    public LoaiGiaoHang(Integer maloaigh, String tenloaigh) {
        this.maloaigh = maloaigh;
        this.tenloaigh = tenloaigh;
    }

    public Integer getMaloaigh() {
        return maloaigh;
    }

    public void setMaloaigh(Integer maloaigh) {
        this.maloaigh = maloaigh;
    }

    public String getTenloaigh() {
        return tenloaigh;
    }

    public void setTenloaigh(String tenloaigh) {
        this.tenloaigh = tenloaigh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maloaigh != null ? maloaigh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoaiGiaoHang)) {
            return false;
        }
        LoaiGiaoHang other = (LoaiGiaoHang) object;
        if ((this.maloaigh == null && other.maloaigh != null) || (this.maloaigh != null && !this.maloaigh.equals(other.maloaigh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.LoaiGiaoHang[ maloaigh=" + maloaigh + " ]";
    }
}
