package com.spring.boot.inmuebles.service;

import com.spring.boot.inmuebles.dto.UsuarioInmuebleDto;

import java.util.List;



public interface IUsuarioInmuebleService {
    public List<UsuarioInmuebleDto> findByPalabraClave(String palabraClave);
}
