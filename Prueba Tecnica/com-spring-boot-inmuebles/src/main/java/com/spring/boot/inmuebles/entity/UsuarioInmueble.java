package com.spring.boot.inmuebles.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="UsuarioInmueble")
public class UsuarioInmueble implements Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(pattern = "yyyy/MM/dd")
    private Date dueDate;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_inmueble")
    private Inmueble inmueble;

    public UsuarioInmueble() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Usuario getCiudad() {
        return usuario;
    }

    public void setCiudad(Usuario usuario) {
        this.usuario = usuario;
    }

    public Inmueble getDireccion() {
        return inmueble;
    }

    public void setDireccion(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    private static final long serialVersionUID = 1L;
}