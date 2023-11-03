package com.tobeto.spring_1b;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/persons")

public class PersonsController {

    @GetMapping("get")
    public String get(){
        return "Kullanıcı Getirildi";
    }

    @PostMapping("post")
    public String post(){
        return "Kullanıcı Eklendi";
    }

    @PutMapping("put")
    public String put(){
        return "Kullanıcı Güncellendi";
    }
    @DeleteMapping("delete")
    public String delete(){
        return "Kullanıcı Silindi";
    }
}
