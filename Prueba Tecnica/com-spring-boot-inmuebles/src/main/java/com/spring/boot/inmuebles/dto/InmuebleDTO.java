package com.spring.boot.inmuebles.dto;

public class InmuebleDTO {

    private String ciudad;
    private String direccion;
    private String tipoInmueble;

    public InmuebleDTO() {
    }

    public InmuebleDTO(String ciudad, String direccion, String tipoInmueble) {
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
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
}
