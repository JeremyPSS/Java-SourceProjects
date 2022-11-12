/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Jeremy Prieto
 */
public class Pelicula_e8 {
    private String nombre;
    private String categoria;
    private String duracion;
    private String actorp;

    public Pelicula_e8() {
    }

    public Pelicula_e8(String nombre, String categoria, String duracion, String actorp) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.actorp = actorp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getActorp() {
        return actorp;
    }

    public void setActorp(String actorp) {
        this.actorp = actorp;
    }
    
    
    
    
    
}
