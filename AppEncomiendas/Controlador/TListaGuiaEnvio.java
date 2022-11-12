/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Camiones;
import Entidades.Clientes;
import Entidades.Encomiendas;
import Entidades.GuiaEnvio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Félix
 */
public class TListaGuiaEnvio {
    
    public static List<GuiaEnvio> Lista = new ArrayList<GuiaEnvio>();
    public static List<Encomiendas> ListaEncomienda = new ArrayList<Encomiendas>();
    
    public static void Agregar(GuiaEnvio oe){
        Lista.add(oe);
    }
    
    public static void Actualizar(GuiaEnvio oe, int pos){
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
    
    public static int BuscarCliente(String codigo){
        int pos =-1;
        for (int i = 0; i < Lista.size(); i++) {
            if(Lista.get(i).getCodCliente().equals(codigo)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static int BuscarEncomienda(String codigo){
        int pos =-1;
        for (int i = 0; i < ListaEncomienda.size(); i++) {
            if(ListaEncomienda.get(i).getCodigo().equals(codigo)){
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static GuiaEnvio obtenerGuiaEnvio(int pos){
        return Lista.get(pos);
    }
    
    public static DefaultTableModel tablaModeloGuiaEnvio(){
        String titulos[] = {"CODIGO","CLIENTE","CAMION","PESO","COSTO"};
        String datos[]   = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for (int i = 0; i < Lista.size(); i++) {
            
           // int pos = TListaEncomienda.BuscarEncomienda(Lista.get(i).getCodEncomienda());
            //Encomiendas oe = TListaEncomienda.obtenerEncomienda(pos);
            
            int posCliente = TListaCliente.BuscarCodigo(Lista.get(i).getCodCliente());
            Clientes oc = TListaCliente.obtenerCliente(posCliente);
            
            int posCamion = TListaCamion.BuscarCamionId(Lista.get(i).getIdCamion());
            Camiones ob = TListaCamion.obtenerCamion(posCamion);
            
            datos[0] = Lista.get(i).getCodigo();
            datos[1] = oc.getNombres();
            datos[2] = ob.getPlaca();
            //datos[3] = Lista.get(i).getCodEncomienda();
            //datos[4] = String.valueOf(oe.getPeso());
            //datos[5] = String.valueOf(oe.getCosto());
            //datos[6] = String.valueOf(oe.getDireccion());
            
            modelo.addRow(datos);
        }
        
        return modelo;
        
    }
    
    //ENCOMIENDAS
    public static void AgregaEncomiendaTemp(Encomiendas oe){
        ListaEncomienda.add(oe);
    }
    public static void BorrarEncomiendaTemp(int pos){
        ListaEncomienda.remove(pos);
    }
    public static void LimpiarEncomiendaTemp(){
        ListaEncomienda.clear();
    }
    public static DefaultTableModel tablaModelEncomiendaTemp(){
        String titulos[] = {"CODIGO","PESO","DIRECCION","COSTO"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < ListaEncomienda.size(); i++) {
            String datos[] = {
                ListaEncomienda.get(i).getCodigo(),
                String.valueOf(ListaEncomienda.get(i).getPeso()),
                ListaEncomienda.get(i).getDireccion(),
                String.valueOf(ListaEncomienda.get(i).getCosto())
            };
            modelo.addRow(datos);
        }
        return modelo;
    }
    
    public static DefaultTableModel tablaModeloEncomienda(){
        String titulos[] = {"CODIGO","PESO","DIRECCION","COSTO","ESTADO"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < TListaEncomienda.Count(); i++) {
            Encomiendas op = TListaEncomienda.obtenerEncomienda(i);
            int pos = BuscarEncomienda(op.getCodigo());
            if(op.getEstado().equals("PENDIENTE") && pos == -1 ){   
                String datos[] = {
                    op.getCodigo(),
                    String.valueOf(op.getPeso()),
                    op.getDireccion(),
                    String.valueOf(op.getCosto()),
                    op.getEstado()
                };

                modelo.addRow(datos);
            }
        }
        return modelo;
    }
    
    public static DefaultTableModel tablaModeloEncomienda(String codGuia){
        String titulos[] = {"CODIGO","PESO","DIRECCION","COSTO","ESTADO"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        
        for (int i = 0; i < TListaEncomienda.Count(); i++) {
            Encomiendas op = TListaEncomienda.obtenerEncomienda(i);
            if(op.getCodGuia().equals(codGuia)){   
                String datos[] = {
                    op.getCodigo(),
                    String.valueOf(op.getPeso()),
                    op.getDireccion(),
                    String.valueOf(op.getCosto()),
                    op.getEstado()
                };

                modelo.addRow(datos);
            }
        }
        return modelo;
    }
    
    
    public static void ActualizarEstadoEncomienda(String codigo, String estado){
        for (int i = 0; i < ListaEncomienda.size(); i++) {
            
            int pos = TListaEncomienda.BuscarEncomienda(ListaEncomienda.get(i).getCodigo());
            Encomiendas op = TListaEncomienda.obtenerEncomienda(pos);
            
            op.setCodGuia(codigo);
            op.setEstado(estado);
            
            TListaEncomienda.Actualizar(op, pos);
            
        }
    }
    
    public static void AtualizarEstadoCamion(int idCamion, String estado){
        for (int i = 0; i < TListaCamion.Count(); i++) {
            Camiones op = TListaCamion.obtenerCamion(i);
            if(op.getId() == idCamion){
                op.setEstado(estado);
                TListaCamion.Actualizar(op, i);
            }
        }
    }
    
    public static double PesoOcupado(int buscar){
        double peso = 0;
        for (int i = 0; i < ListaEncomienda.size(); i++) {
                
            peso += ListaEncomienda.get(i).getPeso();

        }
        return peso;
    }
    
}
