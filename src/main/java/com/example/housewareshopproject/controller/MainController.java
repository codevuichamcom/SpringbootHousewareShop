package com.example.housewareshopproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/products")
    public String getListProducts(){
        return "listProduct";
    }

    @GetMapping("/detail")
    public String detail(){
        return "detail";
    }

    @GetMapping("/carts")
    public String getListCart(){
        return "listCart";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }

    @GetMapping("/prepare-shipping")
    public String prepareShipping(){
        return "prepareShipping";
    }
}
