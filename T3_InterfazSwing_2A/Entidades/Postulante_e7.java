/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Jeremy PRIETO
 */
public class Postulante_e7 {
    private String nombre;
    private int pbien,pmal;
    private double puntaje;

    public Postulante_e7() {
        
    }

    public Postulante_e7(String nombre, int pbien, int pmal) {
        this.nombre = nombre;
        this.pbien = pbien;
        this.pmal = pmal;
    }
    
    public double Puntaje(){
        puntaje = (double) pbien*4.8 - (double)pmal*1.04;
        return puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPbien() {
        return pbien;
    }

    public void setPbien(int pbien) {
        this.pbien = pbien;
    }

    public int getPmal() {
        return pmal;
    }

    public void setPmal(int pmal) {
        this.pmal = pmal;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
    
}
