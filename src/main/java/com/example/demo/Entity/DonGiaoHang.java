package com.example.demo.Entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "DONGIAOHANG")
@Data
public class DonGiaoHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MADON")
    private Integer madon;
    @Basic(optional = false)
    @Column(name = "DIEMLAYHANG")
    private String diemlayhang;
    @Basic(optional = false)
    @Column(name = "TENNGUOILAYHANG")
    private String tennguoilayhang;
    @Basic(optional = false)
    @Column(name = "SDTLAYHANG")
    private String sdtlayhang;
    @Basic(optional = false)
    @Column(name = "DIEMNHANHANG")
    private String diemnhanhang;
    @Basic(optional = false)
    @Column(name = "TENNGUOINHANHANG")
    private String tennguoinhanhang;
    @Basic(optional = false)
    @Column(name = "SDTNHANHANG")
    private String sdtnhanhang;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "THUHO")
    private long thuho;
    @Basic(optional = false)
    @Column(name = "NGAYLAYHANG")
    @Temporal(TemporalType.DATE)
    private Date ngaylayhang;
    @Basic(optional = false)
    @Column(name = "PHIGIAOHANG")
    private long phigiaohang;
    @Basic(optional = false)
    @Column(name = "NGUOIGUITRASHIP")
    private boolean nguoiguitraship;
    @Column(name = "GHICHU")
    private String ghichu;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "donGiaoHang")
    private Collection<ChiTietVanChuyen> chiTietVanChuyenCollection;
    @JoinColumn(name = "MAGH", referencedColumnName = "MAGH")
    @OneToOne(optional = false)
    private GoiHang magh;
    @Column(name = "MAKH")
    private int makh;
    @JoinColumn(name = "MAPT", referencedColumnName = "MAPT")
    @ManyToOne(optional = false)
    private PhuongThucThanhToan mapt;

    public DonGiaoHang() {
    }

    public DonGiaoHang(Integer madon) {
        this.madon = madon;
    }

    public DonGiaoHang(Integer madon, String diemlayhang, String tennguoilayhang, String sdtlayhang, String diemnhanhang, String tennguoinhanhang, String sdtnhanhang, Date ngaylayhang, long phigiaohang, boolean nguoiguitraship) {
        this.madon = madon;
        this.diemlayhang = diemlayhang;
        this.tennguoilayhang = tennguoilayhang;
        this.sdtlayhang = sdtlayhang;
        this.diemnhanhang = diemnhanhang;
        this.tennguoinhanhang = tennguoinhanhang;
        this.sdtnhanhang = sdtnhanhang;
        this.ngaylayhang = ngaylayhang;
        this.phigiaohang = phigiaohang;
        this.nguoiguitraship = nguoiguitraship;
    }

    public void copyDGH(DonGiaoHang x){
        this.diemlayhang = x.diemlayhang;
        this.tennguoilayhang = x.tennguoilayhang;
        this.sdtlayhang = x.sdtlayhang;
        this.diemnhanhang = x.diemnhanhang;
        this.tennguoinhanhang = x.tennguoinhanhang;
        this.sdtnhanhang = x.sdtnhanhang;
        this.ngaylayhang = x.ngaylayhang;
        this.phigiaohang = x.phigiaohang;
        this.nguoiguitraship = x.nguoiguitraship;
        this.ghichu = x.ghichu;

    }
    public Integer getMadon() {
        return madon;
    }

    public void setMadon(Integer madon) {
        this.madon = madon;
    }

    public String getDiemlayhang() {
        return diemlayhang;
    }

    public void setDiemlayhang(String diemlayhang) {
        this.diemlayhang = diemlayhang;
    }

    public String getTennguoilayhang() {
        return tennguoilayhang;
    }

    public void setTennguoilayhang(String tennguoilayhang) {
        this.tennguoilayhang = tennguoilayhang;
    }

    public String getSdtlayhang() {
        return sdtlayhang;
    }

    public void setSdtlayhang(String sdtlayhang) {
        this.sdtlayhang = sdtlayhang;
    }

    public String getDiemnhanhang() {
        return diemnhanhang;
    }

    public void setDiemnhanhang(String diemnhanhang) {
        this.diemnhanhang = diemnhanhang;
    }

    public String getTennguoinhanhang() {
        return tennguoinhanhang;
    }

    public void setTennguoinhanhang(String tennguoinhanhang) {
        this.tennguoinhanhang = tennguoinhanhang;
    }

    public String getSdtnhanhang() {
        return sdtnhanhang;
    }

    public void setSdtnhanhang(String sdtnhanhang) {
        this.sdtnhanhang = sdtnhanhang;
    }

    public long getThuho() {
        return thuho;
    }

    public void setThuho(long thuho) {
        this.thuho = thuho;
    }

    public Date getNgaylayhang() {
        return ngaylayhang;
    }

    public void setNgaylayhang(Date ngaylayhang) {
        this.ngaylayhang = ngaylayhang;
    }

    public long getPhigiaohang() {
        return phigiaohang;
    }

    public void setPhigiaohang(long phigiaohang) {
        this.phigiaohang = phigiaohang;
    }

    public boolean getNguoiguitraship() {
        return nguoiguitraship;
    }

    public void setNguoiguitraship(boolean nguoiguitraship) {
        this.nguoiguitraship = nguoiguitraship;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public Collection<ChiTietVanChuyen> getChiTietVanChuyenCollection() {
        return chiTietVanChuyenCollection;
    }

    public void setChiTietVanChuyenCollection(Collection<ChiTietVanChuyen> chiTietVanChuyenCollection) {
        this.chiTietVanChuyenCollection = chiTietVanChuyenCollection;
    }

    public GoiHang getMagh() {
        return magh;
    }


    public int getMakh() {
        return makh;
    }

    public void setMakh(int makh) {
        this.makh = makh;
    }

    public PhuongThucThanhToan getMapt() {
        return mapt;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (madon != null ? madon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DonGiaoHang)) {
            return false;
        }
        DonGiaoHang other = (DonGiaoHang) object;
        if ((this.madon == null && other.madon != null) || (this.madon != null && !this.madon.equals(other.madon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HIHI.DonGiaoHang[ madon=" + madon + " ]";
    }
}
