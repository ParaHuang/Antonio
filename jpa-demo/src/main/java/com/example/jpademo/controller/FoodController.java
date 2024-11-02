package com.example.jpademo.controller;

import com.example.jpademo.FoodRepository;
import com.example.jpademo.entity.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FoodController {
    @Autowired
    FoodRepository foodRepository;
    @RequestMapping("/addFood")
    public String addFood(String name,double price,String unit,String description){
//        jdbc:insert into food values ....
//        insert
//        foodRepository.save(object);
//        delete
//        delete by condition
//        foodRepository.delete(object);
//        delete by primary key
//        foodRepository.deleteById(id);
//        update
//        foodRepository.save(object);
//        select
//        select all
//        foodRepository.findAll()
//        select by primary key
//        foodRepository.findById(id)
//        Food food = new Food(null,"burger",15.0,null,"yummy");
        Food food = new Food(null,name,price,unit,description);
//        food.get
        foodRepository.save(food);  //Hibernate: insert into food (description, name, price, unit) values (?, ?, ?, ?)

        //return "home.html";             //forward to home page without data
        return "redirect:/getFoods";  //redirect to the home page with data =>getFoods
    }

    @RequestMapping("/getFoods")
    public String getFoods(Model model){
        //jdbc:select * from food
        List<Food> list = foodRepository.findAll();
//        System.out.println(list);
        model.addAttribute("list",list);
        return "home.html";
    }
}
