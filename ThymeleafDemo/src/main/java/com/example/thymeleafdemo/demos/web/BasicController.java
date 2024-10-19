package com.example.thymeleafdemo.demos.web;

import com.example.thymeleafdemo.demos.web.entity.Food;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
public class BasicController {
    // http://127.0.0.1:8080/html
    @RequestMapping("/html")
    public String html(Model model) {
        //pass some data from server to client
        System.out.println("execute the method html");

        //use model to save information in server
        //then client can access those information by thymeleaf
        model.addAttribute("msg", "real information comes from server");

        return "index.html";    //refers to the page in templates
    }

    @RequestMapping("/page1")
    public String page1(Model model) {
        model.addAttribute("name", "Information saved in Server");
//        model.addAttribute("name",null);
        return "page1.html";
    }

    @RequestMapping("/login")   //define the network address of an endpoint
    public String login(String username,String password,Model model){
        System.out.println(username+"---"+password);
        //admin---123   -> index.html
        if("admin".equals(username) && "123".equals(password)){
            model.addAttribute("username",username);

            Food f1 = new Food(1,"burger",10);
            model.addAttribute("food",f1);

            model.addAttribute("list", List.of("hello","hola","Jack","Tom","Alex"));
            model.addAttribute("foods",List.of(
                    new Food(1001,"burger",10),
                    new Food(1002,"cheess",4),
                    new Food(1003,"beverage",5),
                    new Food(1004,"dessert",20),
                    new Food(1005,"sandwich",13),
                    new Food(1006,"soup",19)
            ));
            return "index.html";
        }else {
            //wrong -> error.html
            return "error.html";
        }
    }





}