package com.example.demo;

import com.example.demo.Entity.TaiKhoan;
import com.example.demo.respository.TaiKhoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class GiaohangApplication {

	public static void main(String[] args) {
		SpringApplication.run(GiaohangApplication.class, args);
	}
}

