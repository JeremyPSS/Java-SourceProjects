/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package METODOS;

/**
 *
 * @author WUSUARIO
 */
public class TListas {
    /*
    public static void NumeroTicketMayorImporte(){
             double a=0,b=0;
            double mayor=0,menor=0;
        
            for(int i=0;i<TLista.Lista.size();i++){
                if(TLista.Lista.get(i).pasaje()>a){
                    mayor = TLista.Lista.get(i).getNumero();
                    menor = TLista.Lista.get(i).getNumero();
                    
           
                    a=TLista.Lista.get(i).pasaje();
                    b=TLista.Lista.get(i).pasaje();
                }else{
                    if(TLista.Lista.get(i).pasaje()<b){
                        menor = TLista.Lista.get(i).getNumero();
                        b=TLista.Lista.get(i).pasaje();
                    }
                }
            }
            JOptionPane.showMessageDialog(null,"El ticket de mayor importe fue el: " + mayor);


	}
      */
    /*
    public static void PorcentajeVentas(){
            int sue1=0,sue2=0,sue3=0;
            double suma=0,por1=0;
            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).getNumeroDestino()==1){
                    sue1++;
                }
                if(Lista.get(i).getNumeroDestino()==2){
                    sue2++;
                }
                if(Lista.get(i).getNumeroDestino()==3){
                    sue3++;
                }
                suma=sue3+sue1+sue2;
                
               
            }
            JOptionPane.showMessageDialog(null,"-----Porcentaje de ventas de cada destino-----"+"\nMendoza: "+((sue1*100)/suma)+" %"+"\nNeuquen: "+((sue2*100)/suma)+" %"+"\nCorrientes: " + ((sue3*100)/suma));


	}
    */
    /*
    public static void SaldoAcumuladoTodosClientes(){
            double cantz1=0,cantz2=0;
            for(int i=0;i<Lista.size();i++){
                if(Lista.get(i).getCodigoZona()==1){
                    if(Lista.get(i).getCodigoSucursal()==1) s1+=Lista.get(i).getSaldoCliente();
                    if(Lista.get(i).getCodigoSucursal()==2) s2+=Lista.get(i).getSaldoCliente();
                    if(Lista.get(i).getCodigoSucursal()==3) s3+=Lista.get(i).getSaldoCliente();
//                    totalz1=s1 +s2 +s3;
                    cantz1++;
                }
                totalz1=s1 +s2 +s3;
                if(Lista.get(i).getCodigoZona()==2){
                    if(Lista.get(i).getCodigoSucursal()==1) s4+=Lista.get(i).getSaldoCliente();
                    if(Lista.get(i).getCodigoSucursal()==2) s5+=Lista.get(i).getSaldoCliente();
                    if(Lista.get(i).getCodigoSucursal()==3) s6+=Lista.get(i).getSaldoCliente();
//                    totalz2 = s4+s5+s6;
                    cantz2++;
                }
                totalz2 = s4 + s5 + s6;
            }
            double totalgeneral = totalz1+totalz2;
            
            JOptionPane.showMessageDialog(null,
                    "Surcursal: 1       SaldoAcumuladodetodoslosClientes: " +s1+
                    "\nSucursal:2       SaldoAcumuladodetodoslosClientes: " +s2+
                    "\nSurcursal: 3     SaldoAcumuladodetodoslosClientes: "+s3+
                    "\nTotalZona 1: "+totalz1+"\n"+
                    "\nSurcursal:1       SaldoAcumuladodetodoslosClientes: " +s4+
                    "\nSucursal:2       SaldoAcumuladodetodoslosClientes: " +s5+
                    "\nSurcursal: 3     SaldoAcumuladodetodoslosClientes: "+s6+
                   "\nTotalZona 2: "+totalz2+"\n"+
                    "\nZona: 1"+
                    "\nCantidad de Usuarios de la zona: " + cantz1+
                    "\nTotal Facturado en la zona: " + totalz1+
                    "\nZona: 2"+
                    "\nCantidad de Usuarios de la zona: " + cantz2+
                    "\nTotal Facturado en la zona: " + totalz2 
                    );
            
                
		
	}
    */
    /* METODO PARA SABER SI LOS NUMEROS INGRESADOS EN UNA LISTA SON POSITIVOS,ETC
    public static int Positivos(){
            int contador =0;
            for(int i=0; i<ListaNumeros.size();i++){
                if (ListaNumeros.get(i).getNum() == 0) {
			//System.out.println("El número es neutro");
                        contador+=0;
		} else if (ListaNumeros.get(i).getNum() < 0) {
			//System.out.println("El número es negativo");
                        contador+=0;
                        } else {
                            //System.out.println("El número es positivo");
                            contador+=1;
                        }
            }
		return contador;
	}
    */
    /*
    public static void ArticuloMasBarato(){
//            double mayor=0,menor=0;
            for(int i=0;i<TLista.Lista.size();i++){
                if(TLista.Lista.get(i).getPrecio()>mayor){
                    mayor=TLista.Lista.get(i).getPrecio();
                    menor = TLista.Lista.get(i).getPrecio();
                }else if(TLista.Lista.get(i).getPrecio()<menor){
                    menor = TLista.Lista.get(i).getPrecio();
                }
            }
            JOptionPane.showMessageDialog(null,"El precio del articulo mas barato es de: $"+menor);

	}
    */
    
    /**
     * Metodo para mostrar las personas mayores de edad y menores de edad
     */
    /*
    public static void clasificar(){
        int m=0,me=0;
        for(int i=0; i < ListaPersonas.size() ; i++){
            if(ListaPersonas.get(i).getEdad()<18){
              m+=1;  
            }
            if(ListaPersonas.get(i).getEdad()>=18){
              me+=1;  
            }
        }
        JOptionPane.showMessageDialog(null, "Mayores de edad: " + me + "\nMenores de edad: " + m);
    }
    */
    
    
}
