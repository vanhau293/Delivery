package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "XE")
@Data
public class Xe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "BIENSO")
    private String bienso;
    @Basic(optional = false)
    @Column(name = "TENXE")
    private String tenxe;
    @Column(name = "DANGCHAY")
    private Boolean dangchay;
    @Basic(optional = false)
    @Column(name = "MAUXE")
    private String mauxe;
    @JoinColumn(name = "MALOAIXE", referencedColumnName = "MALOAIXE")
    @ManyToOne(optional = false)
    private LoaiXe maloaixe;
    @Column(name = "MANVGH")
    private int manvgh;

    public Xe() {
    }

    public Xe(String bienso) {
        this.bienso = bienso;
    }

    public Xe(String bienso, String tenxe, String mauxe) {
        this.bienso = bienso;
        this.tenxe = tenxe;
        this.mauxe = mauxe;
    }
    public void copyXe(Xe s){
        this.tenxe = s.tenxe;
        this.mauxe = s.mauxe;
        this.dangchay = s.dangchay;
        this.maloaixe = s.maloaixe;
    }
    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getTenxe() {
        return tenxe;
    }

    public void setTenxe(String tenxe) {
        this.tenxe = tenxe;
    }

    public Boolean getDangchay() {
        return dangchay;
    }

    public void setDangchay(Boolean dangchay) {
        this.dangchay = dangchay;
    }

    public String getMauxe() {
        return mauxe;
    }

    public void setMauxe(String mauxe) {
        this.mauxe = mauxe;
    }

    public LoaiXe getMaloaixe() {
        return maloaixe;
    }

    public void setMaloaixe(LoaiXe maloaixe) {
        this.maloaixe = maloaixe;
    }

    public int getManvgh() {
        return manvgh;
    }

    public void setManvgh(int manvgh) {
        this.manvgh = manvgh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (bienso != null ? bienso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Xe)) {
            return false;
        }
        Xe other = (Xe) object;
        if ((this.bienso == null && other.bienso != null) || (this.bienso != null && !this.bienso.equals(other.bienso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.Xe[ bienso=" + bienso + " ]";
    }
}
