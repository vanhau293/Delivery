package com.example.demo.controllers;

import com.example.demo.Entity.*;
import com.example.demo.exception.NotFoundException;
import com.example.demo.respository.DonhangRepository;
import com.example.demo.respository.KhachHangRepository;
import com.example.demo.respository.PhuongThucTTRepository;
import com.example.demo.respository.TrangThaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/donhang")
public class DonhangControler {
    @Autowired
    private DonhangRepository donHangRepository;
    @Autowired
    private TrangThaiRepository trangThaiRepository;

    @Autowired
    private PhuongThucTTRepository phuongThucTTRepository;
    @GetMapping("/trangthai")
    public ResponseEntity<?> getTrangThai(){
        List<TrangThai> list = trangThaiRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/pttt")
    public ResponseEntity<?> getPTTT(){
        List<PhuongThucThanhToan> list = phuongThucTTRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping("/pttt")
    public PhuongThucThanhToan createTaiKhoan(@RequestBody PhuongThucThanhToan pttt){
        PhuongThucThanhToan save = phuongThucTTRepository.save(pttt);
        return save;
    }
    @PutMapping("/pttt/{id}")
    public PhuongThucThanhToan updateTK(@RequestBody PhuongThucThanhToan pttt,@PathVariable Integer id){

        PhuongThucThanhToan save = phuongThucTTRepository.findById(id).orElseThrow(() -> new NotFoundException("Not found with id: "+id));
        save.setTenpt(pttt.getTenpt());

        return phuongThucTTRepository.save(save);
    }
    @GetMapping("/{maDH}")
    public ResponseEntity<?> getDonHang(@PathVariable int maDH){
        List<DonGiaoHang> list = donHangRepository.findAll();
        for(DonGiaoHang i : list){
            if(i.getMadon() == maDH) return ResponseEntity.ok(i);
        }
        return  null;
    }
    @PostMapping("")
    public DonGiaoHang themDonHang(@RequestBody DonGiaoHang dgh){
        return donHangRepository.save(dgh);
    }
    @PutMapping("/{madh}")
    public DonGiaoHang suaDonHang(@RequestBody DonGiaoHang dgh, @PathVariable int madh){
        DonGiaoHang s = donHangRepository.findById(madh).orElseThrow(() -> new NotFoundException("Không tồn tại đơn hàng "+ madh));
        s.copyDGH(dgh);
        return donHangRepository.save(s);
    }
    @DeleteMapping("/{madh}")
    public void xoaDonHang(@PathVariable int madh){
        donHangRepository.deleteById(madh);
    }
    @GetMapping("/list/{makh}")
    public ResponseEntity<?> dsDHcuaKH(@PathVariable int makh){
        List<DonGiaoHang> list = new ArrayList<DonGiaoHang>();
        List<DonGiaoHang> listc = donHangRepository.findAll();
        for(DonGiaoHang i: listc){
            if(i.getMakh().getMakh() == makh) list.add(i);
        }
        return ResponseEntity.ok(list);
    }

}
