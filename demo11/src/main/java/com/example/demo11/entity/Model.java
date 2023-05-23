package com.example.demo11.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "model")
public class Model {
    @Id
    private Integer id ;
    @Column(name = "name")
    private String name ;
    @Column(name="marka_id")
    private int marka_id ;

}
