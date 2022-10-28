package com.spring.boot.inmuebles.dto;

import java.util.Date;
import java.util.List;


public class UsuarioInmuebleDto {
    private String nombre;
    private String apellido;
    private String email;

    private List<InmuebleDTO> inmuebles;
    private Date dueDate;

    public UsuarioInmuebleDto(String nombre, String apellido, String email, List<InmuebleDTO> inmuebles) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.inmuebles = inmuebles;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<InmuebleDTO> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(List<InmuebleDTO> inmuebles) {
        this.inmuebles = inmuebles;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
