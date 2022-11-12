/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Datos.Conexion;
import Entidades.Proveedor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WUSUARIO
 */
public class ProveedorDAO {
     private static final String Consultar = "Select * from proveedor";
     private static final String Insertar = "insert into proveedor values(?,?,?,?,?,?,?,?)";
     private static final String Modificar = "update proveedor set IdProveedor = ?,CedProveedor=?,Nombre = ?,Representante = ?,Direccion = ?,Ciudad = ?,Telefono = ?,Fax = ? where IdProveedor = ?";
     private static final String Eliminar = "delete from proveedor where IdProveedor = ?";
     
     public List<Proveedor> ListarProveedor(){
         List<Proveedor> lista = new ArrayList<Proveedor>();
         try{
             Conexion con = new Conexion();
             Connection objConexion = con.ObtenerConexion();
             Statement statement  = objConexion.createStatement();
             ResultSet resultado = statement.executeQuery(Consultar);
             
             while(resultado.next()){
                 Proveedor op = new Proveedor();
                 op.setCodigo(resultado.getInt(1));
                 op.setCedula(resultado.getString(2));
                 op.setNomProveedor(resultado.getString(3));
                 op.setRepProveedor(resultado.getString(4));
                 op.setDirProveedor(resultado.getString(5));
                 op.setCiuProveedor(resultado.getString(6));
                 op.setTelProveedor(resultado.getString(7));
                 op.setFaxProveedor(resultado.getString(8));
                 lista.add(op);
             }
             }catch(SQLException e){
                 System.out.println(e.getMessage());
             
         }
         return lista;
     }
     
      public  DefaultTableModel Visualizar(List<Proveedor> Lista){
        String[] Titulos = {"Codigo", "Cedula","NomProveedor","representante","direccion","ciudad","tel","fax"};//Titulos para las columnas de las tablas
        String[] Registros = new String[8];
        DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
        for(Proveedor op: Lista){
           Registros[0] =  String.valueOf(op.getCodigo());
           Registros[1] =  op.getCedula();
           Registros[2] =  op.getNomProveedor();
           Registros[3] =  op.getRepProveedor();
           Registros[4] =  op.getDirProveedor();
           Registros[5] =  op.getCiuProveedor();
           
           Registros[6] = op.getTelProveedor();
           Registros[7] = op.getFaxProveedor();
           
           dtm.addRow(Registros);
        }
        
        return dtm;
    }
     
     
}
