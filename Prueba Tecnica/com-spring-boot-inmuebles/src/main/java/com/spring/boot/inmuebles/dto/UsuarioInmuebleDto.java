package com.spring.boot.inmuebles.dto;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Date;


public class UsuarioInmuebleDto implements Serializable {
    private String nombre;
    private String apellido;
    private String email;
    private String ciudad;
    private String direccion;
    private String tipoInmueble;
    private Date dueDate;


    public UsuarioInmuebleDto(String nombre, String apellido, String email, String ciudad, String direccion, String tipoInmueble, Date dueDate) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
        this.dueDate = dueDate;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    private static final long serialVersionUID = 1L;
}
