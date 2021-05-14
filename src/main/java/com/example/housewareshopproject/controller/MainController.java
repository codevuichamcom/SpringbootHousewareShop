package com.example.housewareshopproject.controller;

import com.example.housewareshopproject.entity.Category;
import com.example.housewareshopproject.entity.Product;
import com.example.housewareshopproject.repository.CategoryRepository;
import com.example.housewareshopproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/")
    public String index(){
        return "home";
    }

    @GetMapping("/products")
    public String getListProducts(Model model, @RequestParam(name = "page",defaultValue = "1") Integer page,
                                  @RequestParam(name = "categoryId",defaultValue = "-1")Integer categoryId,
                                  @RequestParam(name = "subCategoryId",defaultValue ="-1") Integer subCategoryId){
        final int PAGE_SIZE = 20;
        Page<Product> products;
        if(subCategoryId!=-1){
            products = productRepository.findBySubCategoryId(subCategoryId,PageRequest.of(page-1,PAGE_SIZE));
        }else if(categoryId!=-1){
            products= productRepository.findByCategoryId(categoryId,PageRequest.of(page-1,PAGE_SIZE));
        }else{
            products = productRepository.findAll(PageRequest.of((page-1),PAGE_SIZE));
        }
        List<Category> categories =categoryRepository.findAll();
        model.addAttribute("products",products);
        model.addAttribute("categories",categories);
        model.addAttribute("page",page);
        model.addAttribute("totalPage",products.getTotalPages());
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
