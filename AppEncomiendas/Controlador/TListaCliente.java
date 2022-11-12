/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Clientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Félix
 */
public class TListaCliente {
    
    public static List<Clientes> Lista = new ArrayList<Clientes>();
    
    public static void Agregar(Clientes oe){
        Lista.add(oe);
    }
    
    public static void Actualizar(Clientes oe, int pos){
        Lista.set(pos, oe);
    }
    
    public static void Borrar(int pos){
        Lista.remove(pos);
    }
    
    public static int Count(){
        return Lista.size();
    }
    
    public static int BuscarCodigo(String codigo){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getCodigo().equals(codigo)){
                pos = i;
                break;
            }
        }        
        return pos;
    }
    
    public static int BuscarCedula(String cedula){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getCedula().equals(cedula)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static int BuscarNombre(String nombre){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getNombres().equals(nombre)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static Clientes obtenerCliente(int pos){
        return Lista.get(pos);
    }
    
    public static DefaultTableModel tablaModeloCliente(){
        String titulos[] = {"CODIGO","CEDULA","NOMBRES","TELEFONO","DIRECCION"};
        String datos[]   = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < Lista.size(); i++) {
            
            datos[0] = Lista.get(i).getCodigo();
            datos[1] = Lista.get(i).getCedula();
            datos[2] = Lista.get(i).getNombres();
            datos[3] = Lista.get(i).getTelefono();
            datos[4] = Lista.get(i).getDireccion();
            
            modelo.addRow(datos);
            
        }
        
        return modelo;
    }
    
}
