package com.example.demo.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "QUYEN")
@Getter
@Setter
public class Quyen {
    @Id
    @Column(name = "MAQUYEN")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int maQuyen;

    @Column(name = "TENQUYEN")
    private String tenQuyen;

}
