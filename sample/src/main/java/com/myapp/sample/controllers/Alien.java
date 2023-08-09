package com.myapp.sample.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Component
@RestController
public class Alien {

    private int a_id;
    private int a_name;
    private int a_tech;

    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    public int getA_id() {
        return a_id;
    }

    public int getA_name() {
        return a_name;
    }

    public int getA_tech() {
        return a_tech;
    }

    public void setA_id(int a_id) {
        this.a_id = a_id;
    }

    public void setA_name(int a_name) {
        this.a_name = a_name;
    }

    public void setA_tech(int a_tech) {
        this.a_tech = a_tech;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @GetMapping("/showdisplay")
    public  void show(){
        System.out.println("in show");
    //    return "compiling";
        laptop.compile();
    }
}
