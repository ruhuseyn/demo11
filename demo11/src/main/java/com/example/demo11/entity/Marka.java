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
@Entity(name="marka")
public class Marka {
    @Id
    private Integer id ;
    @Column(name = "name")
    private String name ;
}
