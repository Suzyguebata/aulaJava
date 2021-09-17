package com.itau.spring01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello") //Qual o nome do recurso http://
public class HelloController {
    
    @GetMapping("/sample") // para esse recurso, qual ação
    public String getHello() {
        return "Olá Mundo!!!";
    }
    
}
