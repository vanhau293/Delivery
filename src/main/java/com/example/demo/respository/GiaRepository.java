package com.example.demo.respository;

import com.example.demo.Entity.BuuCuc;
import com.example.demo.Entity.Gia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiaRepository extends JpaRepository<Gia, Integer> {
}
