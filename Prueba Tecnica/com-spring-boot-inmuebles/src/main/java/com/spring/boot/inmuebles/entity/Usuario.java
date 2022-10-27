package com.spring.boot.inmuebles.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre", nullable=false, length=255)
    private String nombre;

    @Column(name="apellido", nullable=false, length=255)
    private String apellido;

    @Column(name="email", nullable=false, length=255)
    private String email;

    @OneToMany(mappedBy = "usuario")
    private List<UsuarioInmueble> usuarioInmueble;


    public Usuario() {
        super();
    }

    public Usuario(Long id, String nombre, String apellido, String email) {
        super();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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

    public List<UsuarioInmueble> getUsuarioInmueble() {
        return usuarioInmueble;
    }

    public void setUsuarioInmueble(List<UsuarioInmueble> usuarioInmueble) {
        this.usuarioInmueble = usuarioInmueble;
    }

    private static final long serialVersionUID = 1L;
}
