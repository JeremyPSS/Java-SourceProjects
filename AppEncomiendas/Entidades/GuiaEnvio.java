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
public class GuiaEnvio {
    private String codigo;
    private String codCliente;
    private int idCamion;
    private String estado;

    public GuiaEnvio() {
    }

    public GuiaEnvio(String codigo, String codCliente, int idCamion, String estado) {
        this.codigo = codigo;
        this.codCliente = codCliente;
        this.idCamion = idCamion;
        this.estado = estado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public int getIdCamion() {
        return idCamion;
    }

    public void setIdCamion(int idCamion) {
        this.idCamion = idCamion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
