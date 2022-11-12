package Logica;

import Datos.Conexion;
import Entidades.Categoria;
//import Entidades.Proveedor;
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
public class CategoriaDAO {
    private static final String Consultar = "Select * from categoria";
     private static final String Insertar = "insert into categoria values(?,?,?)";
     private static final String Modificar = "update categoria set IdCategoria = ?,Categoria=?,Descripcion = ? where IdCategoria = ?";
     private static final String Eliminar = "delete from categoria where IdCategoria = ?";
     
     public List<Categoria> ListarCategoria(){
         List<Categoria> listaC = new ArrayList<Categoria>();
         try{
             Conexion con = new Conexion();
             Connection objConexion = con.ObtenerConexion();
             Statement statement  = objConexion.createStatement();
             ResultSet resultado = statement.executeQuery(Consultar);
             
             while(resultado.next()){
                 Categoria oc = new Categoria();
                 oc.setIdCategoria(resultado.getInt(1));
                 oc.setCategorias(resultado.getString(2));
                 oc.setDescripcion(resultado.getString(3));
                 listaC.add(oc);
             }
             }catch(SQLException e){
                 System.out.println(e.getMessage());
             
         }
         return listaC;
     }
     
      public  DefaultTableModel Visualizar(List<Categoria> ListaC){
        String[] Titulos = {"IdCategoria", "Categorias","Descripcion"};//Titulos para las columnas de las tablas
        String[] Registros = new String[3];
        DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
        for(Categoria oc: ListaC){
           Registros[0] =  String.valueOf(oc.getIdCategoria());
           Registros[1] =  oc.getCategorias();
           Registros[2] =  oc.getDescripcion();
           dtm.addRow(Registros);
        }
        
        return dtm;
    }
}
