package com.chocolategamesstudio.Clasespringplatzi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HelloWorldController {

    @GetMapping("/hola")
    public String sayHello(){
        return "nunca pares de aprender \uD83D\uDE0E";
    }
}
