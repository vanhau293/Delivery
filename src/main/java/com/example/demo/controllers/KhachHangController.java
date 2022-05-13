package com.example.demo.controllers;

import com.example.demo.Entity.KhachHang;
import com.example.demo.exception.NotFoundException;
import com.example.demo.respository.KhachHangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/khachhang")
public class KhachHangController {
    @Autowired
    private KhachHangRepository khachHangRepository;
    @GetMapping("")
    public ResponseEntity<?> getListKhachHang(){
        List<KhachHang> list = khachHangRepository.findAll();
        return  ResponseEntity.ok(list);
    }
    @GetMapping("/{tenDN}")
    public ResponseEntity<?> getKhachHang(@PathVariable String tenDN){
        List<KhachHang> list = khachHangRepository.findAll();
        for(KhachHang i : list){
            if(i.getTendangnhap().getTenDangNhap().equals(tenDN)) return ResponseEntity.ok(i);
        }
        return  null;
    }
    @PostMapping("")
    public KhachHang themKH(@RequestBody KhachHang kh){
        return khachHangRepository.save(kh);
    }
    @PutMapping("/{makh}")
    public KhachHang suaKH(@RequestBody KhachHang kh, @PathVariable int makh){
        KhachHang s = khachHangRepository.findById(makh).orElseThrow(() -> new NotFoundException("Không tồn tại khách hàng"+makh));
        s.copyKH(kh);
        return khachHangRepository.save(s);
    }

}
