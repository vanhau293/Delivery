package com.example.demo.controllers;

import com.example.demo.Entity.BuuCuc;
import com.example.demo.Entity.DonGiaoHang;
import com.example.demo.Entity.TaiKhoan;
import com.example.demo.respository.BuuCucRepository;
import com.example.demo.respository.DonhangRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/buucuc")
public class BuuCucController {
    @Autowired
    private BuuCucRepository buuCucRepository;
    @GetMapping("")
    public ResponseEntity<?> getListBuuCuc(){
        List<BuuCuc> list = buuCucRepository.findAll();
        return  ResponseEntity.ok(list);
    }
    @PostMapping("")
    public BuuCuc addProduct(@Valid @RequestBody BuuCuc bc) {

        return buuCucRepository.save(bc);
    }

}
