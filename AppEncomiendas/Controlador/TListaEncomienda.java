/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Clientes;
import Entidades.Encomiendas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Félix
 */
public class TListaEncomienda {
    
    public static List<Encomiendas> Lista = new ArrayList<Encomiendas>();
    
    public static void Agregar(Encomiendas oe){
        Lista.add(oe);
    }
    
    public static void Actualizar(Encomiendas oe, int pos){
        Lista.set(pos, oe);
    }
    
    public static void Borrar(int pos){
        Lista.remove(pos);
    }
    
    public static int Count(){
        return Lista.size();
    }
    
    public static int BuscarEncomienda(String codigo){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getCodigo().equals(codigo)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static Encomiendas obtenerEncomienda(int pos){
        return Lista.get(pos);
    }
    
    public static DefaultTableModel tablaModeloEncomienda(){
        String titulos[] = {"CODIGO","PESO","DIRECCION","COSTO","ESTADO"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < Lista.size(); i++) {
            
            String datos[] = {
                Lista.get(i).getCodigo(),
                String.valueOf(Lista.get(i).getPeso()),
                Lista.get(i).getDireccion(),
                String.valueOf(Lista.get(i).getCosto()),
                Lista.get(i).getEstado()
            };
            modelo.addRow(datos);
        }
        return modelo;
    }
    
    
    public static void CambiarEstado(String codGuia, String estado){
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getCodGuia().equals(codGuia)){
                Encomiendas oe = obtenerEncomienda(i);
                oe.setEstado(estado);
                Actualizar(oe, i);
            }
        }
    }
    
}
