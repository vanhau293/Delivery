package com.example.demo.controllers;

import com.example.demo.respository.GiaRepository;
import com.example.demo.respository.LoaiGiaoHangRepository;
import com.example.demo.respository.NhomCanNangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gia")
public class GiaController {
    @Autowired
    NhomCanNangRepository nhomCanNangRepository;
    @Autowired
    GiaRepository giaRepository;
    @Autowired
    LoaiGiaoHangRepository loaiGiaoHangRepository;
    @GetMapping("loaigiaohang")
    public ResponseEntity<?> layDsLoaiGH(){
        return ResponseEntity.ok(loaiGiaoHangRepository.findAll()) ;
    }
    @GetMapping("nhomcannang")
    public ResponseEntity<?> layDsNhomCN(){
        return ResponseEntity.ok(nhomCanNangRepository.findAll()) ;
    }
    @GetMapping("listgia")
    public ResponseEntity<?> layDsGia(){
        return ResponseEntity.ok(giaRepository.findAll()) ;
    }
}
