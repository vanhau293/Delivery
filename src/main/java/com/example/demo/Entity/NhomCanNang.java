package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "NHOMCANNANG")
@Data
public class NhomCanNang {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MANHOMCAN")
    private Integer manhomcan;
    @Basic(optional = false)
    @Column(name = "TENNHOMCAN")
    private String tennhomcan;
    @Basic(optional = false)
    @Column(name = "TU")
    private int tu;
    @Basic(optional = false)
    @Column(name = "DEN")
    private int den;

    public NhomCanNang() {
    }

    public NhomCanNang(Integer manhomcan) {
        this.manhomcan = manhomcan;
    }

    public NhomCanNang(Integer manhomcan, String tennhomcan, int tu, int den) {
        this.manhomcan = manhomcan;
        this.tennhomcan = tennhomcan;
        this.tu = tu;
        this.den = den;
    }

    public Integer getManhomcan() {
        return manhomcan;
    }

    public void setManhomcan(Integer manhomcan) {
        this.manhomcan = manhomcan;
    }

    public String getTennhomcan() {
        return tennhomcan;
    }

    public void setTennhomcan(String tennhomcan) {
        this.tennhomcan = tennhomcan;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manhomcan != null ? manhomcan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NhomCanNang)) {
            return false;
        }
        NhomCanNang other = (NhomCanNang) object;
        if ((this.manhomcan == null && other.manhomcan != null) || (this.manhomcan != null && !this.manhomcan.equals(other.manhomcan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.NhomCanNang[ manhomcan=" + manhomcan + " ]";
    }
}
