package com.example.demo11.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name="car")
public class Car {
    @Id
    private Integer id ;
    @Column(name="colour")
    private String colour ;
    @Column(name="price")
    private double price ;
    @Column(name="model_id")
    private int model_id ;
}
