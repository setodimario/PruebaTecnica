package com.spring.boot.inmuebles.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="inmueble")
public class Inmueble implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="ciudad", nullable=false, length=255)
    private String ciudad;

    @Column(name="direccion", nullable=false, length=255)
    private String direccion;

    @Column(name="tipo_inmueble", nullable=false, length=255)
    private String tipoInmueble;

    @OneToMany(mappedBy = "inmueble")
    private List<UsuarioInmueble> usuarioInmueble;

    public Inmueble() {
        super();
    }

    public Inmueble(Long id, String ciudad, String direccion, String tipoInmueble) {
        super();
        this.id = id;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<UsuarioInmueble> getUsuarioInmueble() {
        return usuarioInmueble;
    }

    public void setUsuarioInmueble(List<UsuarioInmueble> usuarioInmueble) {
        this.usuarioInmueble = usuarioInmueble;
    }

    private static final long serialVersionUID = 1L;
}
