package com.example.demo.controllers;

import com.example.demo.Entity.LoaiXe;
import com.example.demo.Entity.NhanVien;
import com.example.demo.Entity.Xe;
import com.example.demo.exception.NotFoundException;
import com.example.demo.respository.LoaiXeRepository;
import com.example.demo.respository.NhanVienRepository;
import com.example.demo.respository.XeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/xe")
public class XeController {
    @Autowired
    XeRepository xeRepository;
    @Autowired
    LoaiXeRepository loaiXeRepository;
    @Autowired
    NhanVienRepository nhanVienRepository;
    @GetMapping("/loaixe")
    public ResponseEntity<?> getListLoaiXe(){
        List<LoaiXe> list = loaiXeRepository.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/dangchay/{mabc}")
    public ResponseEntity<?> getListXeDangChay(@PathVariable int mabc) {
        List<Xe> list = xeRepository.findAll();
        List<Xe> listkq = new ArrayList<Xe>();
        for (Xe i : list) {
            if (i.getDangchay() && nhanVienRepository.findById(i.getManvgh()).orElseThrow(() -> new NotFoundException("Không có nv này "+ i.getManvgh())).getMabuucuc().getMabuucuc()==mabc) listkq.add(i);
        }
        return ResponseEntity.ok(listkq);
    }

    @PostMapping("")
    public Xe themXe(@RequestBody Xe xe){
        return  xeRepository.save(xe);
    }
    @PutMapping("/{bienso}")
    public Xe suaXe(@RequestBody Xe xe, @PathVariable String bienso){
        Xe s = xeRepository.findById(bienso).orElseThrow(() -> new NotFoundException("Không tồn tại xe "+bienso));
        s.copyXe(xe);
        return xeRepository.save(s);
    }
}
