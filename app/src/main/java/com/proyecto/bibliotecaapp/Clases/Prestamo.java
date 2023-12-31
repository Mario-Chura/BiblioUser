package com.proyecto.bibliotecaapp.Clases;

public class Prestamo {

    private String cod;
    private String nomLibro;
    private String nomAutor;
    private String nomUbicacion;
    private String anioPublicacion;
    private String edicion;
    private String fechaPrestamo;
    private String fechaDevolucion;

    public Prestamo () {}

    public Prestamo(String cod,
                    String nomLibro,
                    String nomAutor,
                    String nomUbicacion,
                    String anioPublicacion,
                    String edicion,
                    String fechaPrestamo,
                    String fechaDevolucion) {
        this.cod = cod;
        this.nomLibro = nomLibro;
        this.nomAutor = nomAutor;
        this.nomUbicacion = nomUbicacion;
        this.anioPublicacion = anioPublicacion;
        this.edicion = edicion;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNomLibro() {
        return nomLibro;
    }

    public void setNomLibro(String nomLibro) {
        this.nomLibro = nomLibro;
    }

    public String getNomAutor() {
        return nomAutor;
    }

    public void setNomAutor(String nomAutor) {
        this.nomAutor = nomAutor;
    }

    public String getNomUbicacion() {
        return nomUbicacion;
    }

    public void setNomUbicacion(String nomUbicacion) {
        this.nomUbicacion = nomUbicacion;
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
