package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 12-feb-2021 10:58:58 a.m.
 */
public class Vehiculo {

	private String Cliente;
	private String FechaDevolucion;
	private String FechaEntrega;
	private String Modelo;


         int i=1,n,mayord=0,menord=0,sumad =0,sumag=0;
        double importe1=0,importe2=0,suma=0,sumatd=0,sumatg=0;
        int modelod=0,modelog=0;
        String clientem="";
        String descuento;
        double importet;
	public Vehiculo(){

	}

	
	public Vehiculo(String cli, String fed, String fee, String mod){
            this.Cliente=cli;
            this.FechaDevolucion=fed;
            this.FechaEntrega=fee;
            this.Modelo=mod;
            
	}

	public double CalcularDescuento(){
		return 0;
	}

	public void CalcularDia(String c, String m,int d){
            if(m.equals("D")){
            importe1= (d * 3);
            if(d>15){
                importet=importe1*0.9;
                descuento = "10%";
            }
            sumatd+=importe1;
            suma +=importe1;
            sumad +=importe1;
            
            
            if(d>mayord){
                mayord = d;
                menord = d;
                clientem = c;
            }else if(d<menord){
                menord =d;
            }
            modelod+=1;
            
        }
        
        if(m.equals("G")){
            importe1= (d * 3.5);
            if(d>15){
                importet=importe1*0.9;
                descuento = "10%";
            }
            sumatg+=importe2;
            suma +=importe2;
            sumag+=importe2;
            if(d>mayord){
                mayord = d;
                menord = d;
                clientem = c;
            }else if(d<menord){
                menord =d;
            }
            modelog+=1;
        }
	}

	public double CalcularImporte(){
		return 0;
	}

	public void CalcularTotal(int dias){
            double por1 = sumad*(suma/100);
            double por2 = sumag*(suma/100);
            String ganador="";
             if(modelod>modelog){
            ganador="D";
             }else{
               ganador = "G";
             }
             
              JOptionPane.showMessageDialog(null,"Dias transcurridos: " + dias+" El importe es: " + importe1 + " Descuento : " + descuento + " ImporteTotal: " + importet);
                 //JOptionPane.showMessageDialog(null,"Total recaudado por cada modelo de auto: "+"D= "+sumatd+"G= "+sumatg + "\nPorcentaje de alquiler de vehiculos: " +"D= "+por1+"% "+"G= "+por2+"%"+ "\nModelo que mayor vez fue alquilado: "+ganador + "\nCliente que alquilo un vehiculo por mas dias: " + clientem);
	}

        
        
        
        
	public String getCliente(){
		return Cliente;
	}

	public String getFechaDevolucion(){
		return FechaDevolucion;
	}

	public String getFechaEntrega(){
		return FechaEntrega;
	}

	public String getModelo(){
		return Modelo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setCliente(String newVal){
		Cliente = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaDevolucion(String newVal){
		FechaDevolucion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setFechaEntrega(String newVal){
		FechaEntrega = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setModelo(String newVal){
		Modelo = newVal;
	}

}