package com.example.demo.controllers;

import com.example.demo.Entity.LoaiNhanVien;
import com.example.demo.Entity.Quyen;
import com.example.demo.Entity.TaiKhoan;
import com.example.demo.exception.NotFoundException;
import com.example.demo.request.DangNhapRequest;
import com.example.demo.respository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/taikhoan")
public class TaiKhoanController {

    @Autowired
    private TaiKhoanRepository taiKhoanRepository;

    @Autowired
    private QuyenRepository quyenRepository;

    @Autowired
    private LoaiNhanVienRepository loaiNhanVienRepository;


    @GetMapping("/{tenDN}")
    public ResponseEntity<?> getTaiKhoan(@PathVariable String tenDN){
        List<TaiKhoan> list = taiKhoanRepository.findAll();

        for(TaiKhoan i : list){
            if(i.getTenDangNhap().equals(tenDN))
                return ResponseEntity.ok(i);
        }
        return null;
    }
    @GetMapping("quyen")
    public ResponseEntity<?> getListQuyen(){
        List<Quyen> list = quyenRepository.findAll();
        return  ResponseEntity.ok(list);
    }

    @GetMapping("loainv")
    public ResponseEntity<?> getListLoaiNV(){
        List<LoaiNhanVien> list = loaiNhanVienRepository.findAll();
        return  ResponseEntity.ok(list);
    }
    @GetMapping("")
    public ResponseEntity<?> listTK() {
        List<TaiKhoan> list = taiKhoanRepository.findAll();

        return ResponseEntity.ok(list);
    }
    @PostMapping("")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody TaiKhoan tenDN) {
        List<TaiKhoan> list = taiKhoanRepository.findAll();

        for(TaiKhoan i : list){
            if(i.getTenDangNhap().equals(tenDN.getTenDangNhap()))
                return ResponseEntity.ok(i);
        }
        return null;
    }
    @PostMapping("/taotaikhoan")
    public TaiKhoan createTaiKhoan(@RequestBody TaiKhoan tkmoi){
        TaiKhoan save = taiKhoanRepository.save(tkmoi);
        return save;
    }
    @PutMapping("/{tentk}")
    public TaiKhoan updateTaiKhoan(@RequestBody TaiKhoan tk, @PathVariable String tentk){
        TaiKhoan tk2 = taiKhoanRepository.findById(tentk).orElseThrow(() -> new NotFoundException("Not found with id: "+tk.getTenDangNhap()));
        tk2.setMatKhau(tk.getMatKhau());
        TaiKhoan save = taiKhoanRepository.save(tk2);
        return save;
    }
    @PostMapping("/login")
    public TaiKhoan dangnhap(@RequestBody DangNhapRequest tk){
        List<TaiKhoan> list = taiKhoanRepository.findAll();
        for(TaiKhoan i : list){
            if(i.getTenDangNhap().equals(tk.getUsername()) && i.getMatKhau().equals(tk.getPassword())){
                return i;
            }
        }
        return  null;
    }
    @DeleteMapping("/{tendangnhap}")
    public void deleteTaiKhoan(@PathVariable String tendangnhap){
        taiKhoanRepository.deleteById(tendangnhap);
    }
}
