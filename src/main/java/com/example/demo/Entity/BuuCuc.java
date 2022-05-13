package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "BUUCUC")
@Data
public class BuuCuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MABUUCUC")
    private Integer mabuucuc;

    @Column(name = "TENBUUCUC")
    private String tenbuucuc;

    @Column(name = "DIACHI")
    private String diachi;

    public BuuCuc() {
    }

    public BuuCuc(Integer mabuucuc) {
        this.mabuucuc = mabuucuc;
    }

    public BuuCuc(Integer mabuucuc, String tenbuucuc, String diachi) {
        this.mabuucuc = mabuucuc;
        this.tenbuucuc = tenbuucuc;
        this.diachi = diachi;
    }

    public Integer getMabuucuc() {
        return mabuucuc;
    }

    public void setMabuucuc(Integer mabuucuc) {
        this.mabuucuc = mabuucuc;
    }

    public String getTenbuucuc() {
        return tenbuucuc;
    }

    public void setTenbuucuc(String tenbuucuc) {
        this.tenbuucuc = tenbuucuc;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mabuucuc != null ? mabuucuc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BuuCuc)) {
            return false;
        }
        BuuCuc other = (BuuCuc) object;
        if ((this.mabuucuc == null && other.mabuucuc != null) || (this.mabuucuc != null && !this.mabuucuc.equals(other.mabuucuc))) {
            return false;
        }
        return true;
    }
}

