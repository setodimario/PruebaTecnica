package com.spring.boot.inmuebles.controllers;

import com.spring.boot.inmuebles.dto.UsuarioInmuebleDto;
import com.spring.boot.inmuebles.service.IUsuarioInmuebleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/api/v1")
@RestController
public class UsuarioInmuebleController {
    @Autowired
    private IUsuarioInmuebleService usuarioInmuebleService;

     @GetMapping("/usuarioInmueble/{palabraClave}")
    public List<UsuarioInmuebleDto> getUsuarioInmueble(@PathVariable("palabraClave") String palabraClave) {
        List<UsuarioInmuebleDto> usuarioInmueble = usuarioInmuebleService.findByPalabraClave(palabraClave);
        return usuarioInmueble;
    }
}
