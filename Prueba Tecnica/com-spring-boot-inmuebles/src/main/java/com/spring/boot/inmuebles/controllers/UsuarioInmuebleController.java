package com.spring.boot.inmuebles.controllers;

import com.spring.boot.inmuebles.dto.UsuarioInmuebleDto;
import com.spring.boot.inmuebles.service.UsuarioInmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1")
@RestController
public class UsuarioInmuebleController {

    @Autowired
    private UsuarioInmuebleService service; // service principal

    @GetMapping("/usuarioInmueble")
    public List<UsuarioInmuebleDto> getUsuarioInmueble(  ) {
        return service.findAll();
    }
}
