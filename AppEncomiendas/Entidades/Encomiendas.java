/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Félix
 */
public class Encomiendas {
    private String codigo;
    private double peso;
    private String direccion;
    private double costo;
    
    //Atributos adicionales 
    private String estado;
    private String codGuia;
    
    public Encomiendas() {
    }

    public Encomiendas(String codigo, double peso, String direccion, double costo, String estado, String codGuia) {
        this.codigo = codigo;
        this.peso = peso;
        this.direccion = direccion;
        this.costo = costo;
        this.estado = estado;
        this.codGuia = codGuia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodGuia() {
        return codGuia;
    }

    public void setCodGuia(String codGuia) {
        this.codGuia = codGuia;
    }
    
    
}
