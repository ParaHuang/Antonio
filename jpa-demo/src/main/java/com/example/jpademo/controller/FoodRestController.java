package com.example.jpademo.controller;

import com.example.jpademo.entity.Food;
import com.example.jpademo.entity.ResultBody;
import com.example.jpademo.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class FoodRestController {
    @Autowired
    FoodRepository foodRepository;
    @PostMapping("/addFood")
    public ResultBody addFood(Food food){
        foodRepository.save(food);  //Hibernate: insert into food (description, name, price, unit) values (?, ?, ?, ?)
        //{code:200,message:'success',data:xxxxx}
        //200:ok
        //404:not found
        //405:method not support
        //500:server exception
        return new ResultBody(200,"success",food);
    }

    //http://localhost:8080/jpa/rest/getFoods
    @GetMapping("/getFoods")
    public ResultBody getFoods(){
        List<Food> list = foodRepository.findAll();//Hibernate: select f1_0.id,f1_0.description,f1_0.name,f1_0.price,f1_0.unit from food f1_0
        return new ResultBody(200,"success",list);
    }

    @DeleteMapping("/delete")
    public ResultBody deleteFood(int id){
        foodRepository.deleteById(id);//Hibernate: delete from food where id=?
        return new ResultBody(200,"success",null);
    }
    @PutMapping("/update")
    public ResultBody updateFood(Food food){
        foodRepository.save(food);//update food set description=?, name=?, price=?, unit=? where id=?
        return new ResultBody(200,"success",food);
    }
}
