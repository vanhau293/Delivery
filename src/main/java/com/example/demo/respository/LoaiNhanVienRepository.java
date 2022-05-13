package com.example.demo.respository;

import com.example.demo.Entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiNhanVienRepository extends JpaRepository<LoaiNhanVien, Integer> {
}
