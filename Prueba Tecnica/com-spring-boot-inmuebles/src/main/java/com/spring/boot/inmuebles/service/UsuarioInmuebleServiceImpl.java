package com.spring.boot.inmuebles.service;

import com.spring.boot.inmuebles.dto.UsuarioInmuebleDto;
import com.spring.boot.inmuebles.repository.repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioInmuebleServiceImpl implements IUsuarioInmuebleService {


    @Autowired
    public repo repository;


    @Override
    public List<UsuarioInmuebleDto> findByPalabraClave(String palabraClave) {
        return repository.findByPalabraClave(palabraClave);
    }
}
