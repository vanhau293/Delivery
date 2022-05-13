package com.example.demo.respository;

import com.example.demo.Entity.TrangThai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrangThaiRepository extends JpaRepository<TrangThai, String> {
}
