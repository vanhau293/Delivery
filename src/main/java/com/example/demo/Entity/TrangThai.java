package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TRANGTHAI")
@Data
public class TrangThai {
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MATRANGTHAI")
    private Integer matrangthai;
    @Basic(optional = false)
    @Column(name = "TENTRANGTHAI")
    private String tentrangthai;

    public TrangThai() {
    }

    public TrangThai(Integer matrangthai) {
        this.matrangthai = matrangthai;
    }

    public TrangThai(Integer matrangthai, String tentrangthai) {
        this.matrangthai = matrangthai;
        this.tentrangthai = tentrangthai;
    }

    public Integer getMatrangthai() {
        return matrangthai;
    }

    public void setMatrangthai(Integer matrangthai) {
        this.matrangthai = matrangthai;
    }

    public String getTentrangthai() {
        return tentrangthai;
    }

    public void setTentrangthai(String tentrangthai) {
        this.tentrangthai = tentrangthai;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (matrangthai != null ? matrangthai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrangThai)) {
            return false;
        }
        TrangThai other = (TrangThai) object;
        if ((this.matrangthai == null && other.matrangthai != null) || (this.matrangthai != null && !this.matrangthai.equals(other.matrangthai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.TrangThai[ matrangthai=" + matrangthai + " ]";
    }

}

