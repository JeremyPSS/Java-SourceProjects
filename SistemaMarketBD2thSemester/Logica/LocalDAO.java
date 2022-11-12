package Logica;

import Datos.Conexion;
import Entidades.Local;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 * @date 07/04/2021
 * @author Jeremy Prieto
 */
public class LocalDAO {
     private static final String Consultar = "Select * from local";
     private static final String Insertar = "insert into local values(?,?,?,?,?)";
     private static final String Modificar = "update local set IdLocal = ?,Direccion=?,Ciudad = ?,Fax = ?,Telefono = ? where IdLocal = ?";
     private static final String Eliminar = "delete from local where IdLocal = ?";
     
     public List<Local> ListarLocal(){
         List<Local> listaL = new ArrayList<Local>();
         try{
             Conexion con = new Conexion();
             Connection objConexion = con.ObtenerConexion();
             Statement statement  = objConexion.createStatement();
             ResultSet resultado = statement.executeQuery(Consultar);
             
             while(resultado.next()){
                 Local oc = new Local();
                 oc.setIdLocal(resultado.getInt(1));
                 oc.setDirLocal(resultado.getString(2));
                 oc.setCiuLocal(resultado.getString(3));
                 oc.setTelLocal(resultado.getString(4));
                 oc.setFaxLocal(resultado.getString(5));
                 listaL.add(oc);
             }
             }catch(SQLException e){
                 System.out.println(e.getMessage());
             
         }
         return listaL;
     }
     
      public  DefaultTableModel Visualizar(List<Local> ListaL){
        String[] Titulos = {"IdLocal","Direccion","Ciudad","Telefono","Fax"};//Titulos para las columnas de las tablas
        String[] Registros = new String[5];
        DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
        for(Local oc: ListaL){
           Registros[0] =  String.valueOf(oc.getIdLocal());
           Registros[1] =  oc.getDirLocal();
           Registros[2] =  oc.getCiuLocal();
           Registros[3] =  oc.getTelLocal();
           Registros[4] =  oc.getFaxLocal();
           dtm.addRow(Registros);
        }
        
        return dtm;
    }
    
}
