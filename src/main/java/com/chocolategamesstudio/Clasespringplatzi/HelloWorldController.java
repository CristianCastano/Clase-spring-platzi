package com.chocolategamesstudio.Clasespringplatzi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HelloWorldController {

    @GetMapping("/hola")
    public String sayHello(){
        return "practicando nuevamente git \uD83D\uDE0E";
    }
    // cambio para guardar
}
