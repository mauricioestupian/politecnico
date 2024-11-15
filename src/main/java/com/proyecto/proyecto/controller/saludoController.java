package com.proyecto.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/saludo")
public class saludoController {

    @GetMapping("/hola")
    public String saludo() {
        return "Buenos dias";
    }

    @GetMapping("/hola2")
    public String saludo2() {
        return "Buenas Noches";
    }

    @GetMapping("/hola3")
    public String saludo3() {
        return "Buenas Tardes";
    }

    @GetMapping("/holanombre/{nombre}/{edad}")
    public String getMethodName(@PathVariable String nombre,
            @PathVariable int edad) {
        return "hola " + nombre + " tu edad es: " + edad;
    }

}
