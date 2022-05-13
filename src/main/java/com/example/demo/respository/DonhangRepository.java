package com.example.demo.respository;

import com.example.demo.Entity.DonGiaoHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonhangRepository extends JpaRepository<DonGiaoHang, Integer> {
}

