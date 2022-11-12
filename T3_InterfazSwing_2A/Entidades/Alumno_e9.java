/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Formularios.frmEjercicio9;

/**
 *
 * @author Jeremy Prieto
 * 
 */
public class Alumno_e9 {
    private String nombres;
    private String apellidos;
    private String gradoI;
    private String telefono;
    private char sexo;
    private String curso;
    private double preciot;

    public Alumno_e9() {
    }

    public Alumno_e9(String nombres, String apellidos, String gradoI, String telefono, char sexo, String curso, double preciot) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.gradoI = gradoI;
        this.telefono = telefono;
        this.sexo = sexo;
        this.curso = curso;
        this.preciot = preciot;
    }
    

    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getGradoI() {
        return gradoI;
    }

    public void setGradoI(String gradoI) {
        this.gradoI = gradoI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getPreciot() {
        return preciot;
    }

    public void setPreciot(double preciot) {
        this.preciot = preciot;
    }
    
    
    
    
}
