package Entidades;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 22-mar-2021 02:58:27 p.m.
 */
public class Cliente {

	private int NumeroCliente;
	private String NombreCliente;
	private String Sucursal;
	private String CodigoTransaccion;
	private double MontoTransaccion;

	public Cliente(){

	}

        public Cliente(int numeroc, String nombrec, String suc, String codigot, double montot) {
            this.NumeroCliente = numeroc;
            this.NombreCliente = nombrec;
            this.Sucursal = suc;
            this.CodigoTransaccion = codigot;
            this.MontoTransaccion = montot;
        }
        

	public int getNumeroCliente(){
		return NumeroCliente;
	}


	public void setNumeroCliente(int newVal){
		NumeroCliente = newVal;
	}

	public String getNombreCliente(){
		return NombreCliente;
	}

	
	public void setNombreCliente(String newVal){
		NombreCliente = newVal;
	}

	public String getSucursal(){
		return Sucursal;
	}

	
	public void setSucursal(String newVal){
		Sucursal = newVal;
	}

	public String getCodigoTransaccion(){
		return CodigoTransaccion;
	}

	
	public void setCodigoTransaccion(String newVal){
		CodigoTransaccion = newVal;
	}

	public double getMontoTransaccion(){
		return MontoTransaccion;
	}

	
	public void setMontoTransaccion(double newVal){
		MontoTransaccion = newVal;
	}

}