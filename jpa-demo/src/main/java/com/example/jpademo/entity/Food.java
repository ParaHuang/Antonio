package com.example.jpademo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data    //== getter + setter + toString
@AllArgsConstructor
@NoArgsConstructor
public class Food {
    @Id             //primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //auto_increment
    private Integer id;
    private String name;
    private Double price;
    private String unit;
    private String description;

}
