package com.spring.boot.inmuebles.service;

import com.spring.boot.inmuebles.dto.InmuebleDTO;
import com.spring.boot.inmuebles.dto.UsuarioInmuebleDto;
import com.spring.boot.inmuebles.entity.Inmueble;
import com.spring.boot.inmuebles.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioInmuebleService {

    @Autowired
    UsuarioRepository userRepo;

    public List<UsuarioInmuebleDto> findAll() {

        return userRepo.findAll().stream()
                .map((aDto) -> new UsuarioInmuebleDto(
                        aDto.getNombre(),
                        aDto.getApellido(),
                        aDto.getEmail(),
                        convertEntityInmuebleToDto(aDto.getInmuebles())
                )).collect(Collectors.toList());
    }
    private static List<InmuebleDTO> convertEntityInmuebleToDto(List<Inmueble> data) {
        return data.stream()
                .map((i) -> new InmuebleDTO(
                        i.getCiudad(),
                        i.getDireccion(),
                        i.getTipoInmueble()
                )).collect(Collectors.toList());
    }
}
