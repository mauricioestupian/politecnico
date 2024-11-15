package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.proyecto.proyecto.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>(
            Arrays.asList(new Usuario(123, "Mauricio", "Estupiñan")));

    @GetMapping("/users")
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    @GetMapping("/{nombre}")
    public Usuario getusesrid(@PathVariable String nombre) {
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
                return u;
            }
        }
        return null;
    }

    @PostMapping("/usuario")
    public Usuario creausuario(@RequestBody Usuario usuario) {
        usuarios.add(usuario);
        return usuario;
    }

}
