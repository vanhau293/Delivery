package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
@Entity
@Table(name = "LOAIXE")
@Data
public class LoaiXe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MALOAIXE")
    private Integer maloaixe;
    @Column(name = "TENLOAIXE")
    private String tenloaixe;

    public LoaiXe() {
    }

    public LoaiXe(Integer maloaixe) {
        this.maloaixe = maloaixe;
    }

    public Integer getMaloaixe() {
        return maloaixe;
    }

    public void setMaloaixe(Integer maloaixe) {
        this.maloaixe = maloaixe;
    }

    public String getTenloaixe() {
        return tenloaixe;
    }

    public void setTenloaixe(String tenloaixe) {
        this.tenloaixe = tenloaixe;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maloaixe != null ? maloaixe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoaiXe)) {
            return false;
        }
        LoaiXe other = (LoaiXe) object;
        if ((this.maloaixe == null && other.maloaixe != null) || (this.maloaixe != null && !this.maloaixe.equals(other.maloaixe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.LoaiXe[ maloaixe=" + maloaixe + " ]";
    }

}
