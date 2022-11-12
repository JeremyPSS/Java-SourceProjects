/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Camiones;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Félix
 */
public class TListaCamion {
    
    public static List<Camiones> Lista = new ArrayList<Camiones>();
    
    public static void Agregar(Camiones oe){
        Lista.add(oe);
    }
    
    public static void Actualizar(Camiones oe, int pos){
        Lista.set(pos, oe);
    }
    
    public static void Borrar(int pos){
        Lista.remove(pos);
    }
    
    public static int Count(){
        return Lista.size();
    }
    
    public static int BuscarCamionId(int id){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getId() == id){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static int BuscarCamionPlaca(String placa){
        int pos = -1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getPlaca().equals(placa)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static Camiones obtenerCamion(int pos){
        return Lista.get(pos);
    }
    
    public static DefaultTableModel tablaModeloCamion(){
        String titulos[] = {"ID","PLACA","PROPIETARIO","PESO","ESTADO"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < Lista.size(); i++) {
            
            String datos[] = {
                String.valueOf(Lista.get(i).getId()),
                Lista.get(i).getPlaca(),
                Lista.get(i).getPropietario(),
                String.valueOf(Lista.get(i).getPeso()),
                Lista.get(i).getEstado()
            };
            modelo.addRow(datos);
        
        }
        
        return modelo;
    }
    
    public static void CambiarEstado(int idCamion, String estado){
        for (int i = 0; i < Lista.size(); i++) {
            if (Lista.get(i).getId() == idCamion){
                Camiones oc = obtenerCamion(i);
                oc.setEstado(estado);
                Actualizar(oc, i);
            }
        }
    }
    
    
}
