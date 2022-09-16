package com.chocolategamesstudio.Clasespringplatzi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saludar")
public class HelloWorldController {

    @GetMapping("/hola")
    public String sayHello(){
        return "haciendo un cambio desde github. recordando como es la tarea \uD83D\uDE0E";
    }
    // Linea de comentario de master
}
