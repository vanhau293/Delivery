package com.example.demo.respository;


import com.example.demo.Entity.Gia;
import com.example.demo.Entity.LoaiGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiGiaoHangRepository extends JpaRepository<LoaiGiaoHang, Integer> {
}
