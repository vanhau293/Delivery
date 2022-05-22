package com.example.demo.controllers;

import com.example.demo.Entity.NhanVien;
import com.example.demo.exception.NotFoundException;
import com.example.demo.respository.DonhangRepository;
import com.example.demo.respository.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nhanvien")

public class NhanVienController {

    @Autowired
    NhanVienRepository nhanVienRepository;
    @Autowired
    DonhangRepository donhangRepository;
    @GetMapping("")
    public ResponseEntity<?> getListNV(){
        List<NhanVien>  list = nhanVienRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @PostMapping("")
    public NhanVien themNV(@RequestBody NhanVien nv){
       return nhanVienRepository.save(nv);
    }
    @PutMapping("/{manv}")
    public NhanVien suaNV(@RequestBody NhanVien nv, @PathVariable int manv){
        NhanVien s = nhanVienRepository.findById(manv).orElseThrow(() -> new NotFoundException("Không tồn tại nhân viên "+ manv));
        s.copyNV(nv);
        return nhanVienRepository.save(s);
    }
    @GetMapping("/{tenDN}")
    public NhanVien layNV(@PathVariable String tenDN){
        List<NhanVien> list = nhanVienRepository.findAll();
        for(NhanVien i : list){
            if(i.getTendangnhap().getTenDangNhap().equals(tenDN)) return  i;
        }
        return null;
    }

}
