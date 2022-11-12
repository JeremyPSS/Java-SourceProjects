package Controlador;

//import Entidades.Consultor;
import Entidades.Empleado;
//import Entidades.Trabajador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @date 11/03/2021 
 * @author Jeremy Prieto
 * @version 1.0
 */
public class TLista {
      public static List<Empleado> ListaEmpleados = new ArrayList<Empleado>();
      
      public static void Insert(Empleado oe){
          ListaEmpleados.add(oe);
      }
      
      

    public static void EditEmpleado(int pos, Empleado oe){//Metodo para superponer objetos, osea remplazar
        ListaEmpleados.set(pos, oe);
    }
 
    public static void Delete(int pos){
        ListaEmpleados.remove(pos);
    }
    
    public static int Buscar(String ced){
        int pos = -1;
        for(int i=0; i < ListaEmpleados.size() ; i++)
        {
            if(ListaEmpleados.get(i).getCedula().equals(ced))
            {
                pos = i;
                return pos;
            }
        }
        
        return pos;
    }
  
//    //Metodo para añadir una persona/objeto a la lista
    public static Empleado getEmpleado(int pos){
        return ListaEmpleados.get(pos);
    }
    
    
    public static DefaultTableModel Visualizar(){
        String[] Titulos = {"Cedula", "Nombres","Apellidos","Sexo","Edad","Sueldo Cobrar"};//Titulos para las columnas de las tablas
        String[] Registros = new String[6];
        DefaultTableModel dtm=new DefaultTableModel(null,Titulos);//Crecaion de la tabla aun virtual
        for(int i=0; i < ListaEmpleados.size() ; i++){
           Registros[0] =  ListaEmpleados.get(i).getCedula();
           Registros[1] =  ListaEmpleados.get(i).getNombres();
           Registros[2] =  ListaEmpleados.get(i).getApellidos();
           Registros[3] = String.valueOf(ListaEmpleados.get(i).getSexo());
           Registros[4] =  String.valueOf(ListaEmpleados.get(i).getEdad());
           Registros[5] =   String.valueOf(ListaEmpleados.get(i).CalcularSueldo());
           dtm.addRow(Registros);//Creacion de una nueva fila o columna creo
        }
        
        return dtm;//retornar la tabla
    }
}
