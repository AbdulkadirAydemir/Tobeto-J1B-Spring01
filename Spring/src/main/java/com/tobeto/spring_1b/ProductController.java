package com.tobeto.spring_1b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @GetMapping("get")
    public String get(){
        return "Ürün Getirildi";
    }

    @PostMapping("post")
    public String post(){
        return "Ürün Eklendi";
    }

    @PutMapping("put")
    public String put(){
        return "Ürün Güncellendi";
    }
    @DeleteMapping("delete")
    public String delete(){
        return "Ürün Silindi";
    }

}
