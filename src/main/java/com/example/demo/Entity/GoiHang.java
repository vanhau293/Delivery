package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "GOIHANG")
@Data
public class GoiHang {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAGH")
    private Integer magh;
    @Basic(optional = false)
    @Column(name = "KHOILUONG")
    private double khoiluong;
    @Basic(optional = false)
    @Column(name = "CAO")
    private double cao;
    @Basic(optional = false)
    @Column(name = "RONG")
    private double rong;
    @Basic(optional = false)
    @Column(name = "DAI")
    private double dai;
    @Basic(optional = false)
    @Column(name = "MATHANG")
    private String mathang;
    public GoiHang() {
    }

    public GoiHang(Integer magh) {
        this.magh = magh;
    }

    public GoiHang(Integer magh, double khoiluong, double cao, double rong, double dai, String mathang) {
        this.magh = magh;
        this.khoiluong = khoiluong;
        this.cao = cao;
        this.rong = rong;
        this.dai = dai;
        this.mathang = mathang;
    }

    public Integer getMagh() {
        return magh;
    }

    public void setMagh(Integer magh) {
        this.magh = magh;
    }

    public double getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(double khoiluong) {
        this.khoiluong = khoiluong;
    }

    public double getCao() {
        return cao;
    }

    public void setCao(double cao) {
        this.cao = cao;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public String getMathang() {
        return mathang;
    }

    public void setMathang(String mathang) {
        this.mathang = mathang;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (magh != null ? magh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GoiHang)) {
            return false;
        }
        GoiHang other = (GoiHang) object;
        if ((this.magh == null && other.magh != null) || (this.magh != null && !this.magh.equals(other.magh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.GoiHang[ magh=" + magh + " ]";
    }

}
