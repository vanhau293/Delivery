package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "PHUONGTHUCTHANHTOAN")
@Data
public class PhuongThucThanhToan {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MAPT")
    private Integer mapt;
    @Column(name = "TENPT")
    private String tenpt;

    public PhuongThucThanhToan() {
    }

    public PhuongThucThanhToan(Integer mapt) {
        this.mapt = mapt;
    }

    public Integer getMapt() {
        return mapt;
    }

    public void setMapt(Integer mapt) {
        this.mapt = mapt;
    }

    public String getTenpt() {
        return tenpt;
    }

    public void setTenpt(String tenpt) {
        this.tenpt = tenpt;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mapt != null ? mapt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PhuongThucThanhToan)) {
            return false;
        }
        PhuongThucThanhToan other = (PhuongThucThanhToan) object;
        if ((this.mapt == null && other.mapt != null) || (this.mapt != null && !this.mapt.equals(other.mapt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.PhuongThucThanhToan[ mapt=" + mapt + " ]";
    }
}

