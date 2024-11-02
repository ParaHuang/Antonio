package com.example.jpademo.repository;

import com.example.jpademo.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}


//class implements interface
//interface extends interface
//class extends class