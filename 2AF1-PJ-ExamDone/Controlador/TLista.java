package Controlador;
import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 22-mar-2021 02:58:41 p.m.
 */
public class TLista {

        public static List<Cliente> Lista = new ArrayList<Cliente>();

	public static void Insertar(Cliente oc){
            Lista.add(oc);

	}

	public static void Modificar(int pos, Cliente oc){
            Lista.set(pos, oc);

	}

	public static void Eliminar(int pos){
            Lista.remove(pos);
	}
        
        public static Cliente getCliente(int pos){
		 return Lista.get(pos);
	}


	public static int Buscar(int num){
            String dato=String.valueOf(num);
            int pos = -1;
            for(int i=0; i < Lista.size() ; i++)
            {
                if(String.valueOf(Lista.get(i).getNumeroCliente()).equals(dato))
                {
                    pos = i;
                    return pos;
                }
            }
            return pos;
	}


        public static DefaultTableModel Visualizar(){
        String[] Titulos = {"Numero", "Nombre","Sucursal","CodigoT","MontoT"};
        String[] Registros = new String[5];
        DefaultTableModel dtm=new DefaultTableModel(null,Titulos);
            for(int i=0; i < Lista.size() ; i++){
               Registros[0] =  String.valueOf(Lista.get(i).getNumeroCliente());
               Registros[1] =  Lista.get(i).getNombreCliente();
               Registros[2] =  Lista.get(i).getSucursal();
               Registros[3] =  Lista.get(i).getCodigoTransaccion();
               Registros[4] =  String.valueOf(Lista.get(i).getMontoTransaccion());
               dtm.addRow(Registros);
            }
             return dtm;
        }
        
        public static void ClienteMayorExtraccion(){
            double ma=0,me=0,ma2=0,me2=0,ma3=0,me3=0;
            String nom1="",nom2="",nom3="";
            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).getSucursal().equals("Machala")){
                    if(Lista.get(i).getMontoTransaccion()>ma){
                        ma=Lista.get(i).getMontoTransaccion();
                        me=Lista.get(i).getMontoTransaccion();
                        nom1=Lista.get(i).getNombreCliente();
                    }
                }
                if(Lista.get(i).getSucursal().equals("Pasaje")){
                    if(Lista.get(i).getMontoTransaccion()>ma2){
                        ma2=Lista.get(i).getMontoTransaccion();
                        me2=Lista.get(i).getMontoTransaccion();
                        nom2=Lista.get(i).getNombreCliente();
                    }
                }
                if(Lista.get(i).getSucursal().equals("Arenillas")){
                    if(Lista.get(i).getMontoTransaccion()>ma3){
                        ma3=Lista.get(i).getMontoTransaccion();
                        me3=Lista.get(i).getMontoTransaccion();
                        nom3=Lista.get(i).getNombreCliente();
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "----Clientes que hicieron la extraccion por mayor monto----"+"\nMachala: "+nom1+
                    "\nPasaje: "+nom2+"\nArenillas: " + nom3);
        }
        
        public static void PorcentajeSucursales(){
            double total=0,sub1=0,sub2=0,sub3=0;
            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).getSucursal().equals("Machala")){
                    total += Lista.get(i).getMontoTransaccion();
                    sub1 += Lista.get(i).getMontoTransaccion();
                }
                if(Lista.get(i).getSucursal().equals("Pasaje")){
                   total += Lista.get(i).getMontoTransaccion();
                    sub2 += Lista.get(i).getMontoTransaccion();
                }
                if(Lista.get(i).getSucursal().equals("Arenillas")){
                    total += Lista.get(i).getMontoTransaccion();
                    sub3 += Lista.get(i).getMontoTransaccion();
                }
            }
            double por1 = (sub1*100)/total;
            double por2 = (sub2*100)/total;
            double por3 = (sub3*100)/total;
            
            
            JOptionPane.showMessageDialog(null, "----Porcentaje de transacciones realizadas----"+
                    "\nMachala: "+por1+" %"+"\nPasaje: "+por2+" %" + "\nArenillas: " + por3+" %");
        }
        
        public static void SucursalMayorDepositos(){
            double ma=0,me=0,ma2=0,me2=0,ma3=0,me3=0;
            String nom1="",nom2="",nom3="";
            
            
            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).getSucursal().equals("Machala")){
                    if(Lista.get(i).getCodigoTransaccion().equals("Deposito")){
                        ma++;
                    }
                }
                if(Lista.get(i).getSucursal().equals("Pasaje")){
                    if(Lista.get(i).getCodigoTransaccion().equals("Deposito")){
                        ma2++;
                    }
                }
                if(Lista.get(i).getSucursal().equals("Arenillas")){
                    if(Lista.get(i).getCodigoTransaccion().equals("Deposito")){
                        ma3++;
                    }
                }
            }
            String g="";
            if((ma>ma2)&&(ma>ma3)){
                g="N°1 Machala";
            }else if((ma2>ma)&&(ma2>ma3)){
                g="N°2 Machala";
            }else{
                g="N°3 Arenillas";
            }
            JOptionPane.showMessageDialog(null, "--Numero de sucursal que recibio mas cantidad de depositos---"+"\n"+g);
        }

	
     
}