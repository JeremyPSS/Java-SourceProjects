package Logica;

import Datos.Conexion;
import Entidades.Transportista;
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
public class TransportistaDAO {
    private static final String Consultar = "Select * from transpotista";
     private static final String Insertar = "insert into transpotista values(?,?,?,?,?,?)";
     private static final String Modificar = "update transportista set IdTransportista = ?,CedTransportista=?,Nombre = ?,Direccion = ?,Ciudad = ?,Telefono = ? where IdTransportista = ?";
     private static final String Eliminar = "delete from transpotista where IdTransportista = ?";
     
     public List<Transportista> ListaTransportista(){
         List<Transportista> listaT = new ArrayList<Transportista>();
         try{
             Conexion con = new Conexion();
             Connection objConexion = con.ObtenerConexion();
             Statement statement  = objConexion.createStatement();
             ResultSet resultado = statement.executeQuery(Consultar);
             
             while(resultado.next()){
                 Transportista ot = new Transportista();
                 ot.setIdTransportista(resultado.getInt(1));
                 ot.setCedTransportista(resultado.getString(2));
                 ot.setNomTransportista(resultado.getString(3));
                 ot.setDirTransportista(resultado.getString(4));
                 ot.setCiuTransportista(resultado.getString(5));
                 ot.setTelTransportista(resultado.getString(6));
           
                 listaT.add(ot);
             }
             }catch(SQLException e){
                 System.out.println(e.getMessage());
             
         }
         return listaT;
     }
     
      public  DefaultTableModel Visualizar(List<Transportista> ListaT){
        String[] Titulos = {"IdTransportista","CedTransportista","Nombre","Direccion","Ciudad","Telefono"};//Titulos para las columnas de las tablas
        String[] Registros = new String[6];
        DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
        for(Transportista ot: ListaT){
           Registros[0] =  String.valueOf(ot.getIdTransportista());
           Registros[1] =  ot.getCedTransportista();
           Registros[2] =  ot.getNomTransportista();
           Registros[3] =  ot.getDirTransportista();
           Registros[4] =  ot.getCiuTransportista();
           Registros[5] =  ot.getTelTransportista();
           
           dtm.addRow(Registros);
        }
        
        return dtm;
    }
    
}
