package com.example.demo.service;

import com.example.demo.Entity.TaiKhoan;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TaiKhoanService {
    public List<TaiKhoan> getListTK();
    public TaiKhoan getTK(String tenDN);
}