package Entidades;

import javax.swing.JOptionPane;

/**
 * @author JeremyPrieto
 * @version 1.0
 * @created 08-mar-2021 08:41:59 a.m.
 */
public class AsalariadoPorComision extends Empleado {

	private double SalarioBase;
	private double Ventas;


	public AsalariadoPorComision(){
            super();
	}

	
	public AsalariadoPorComision(String ced, String nom, String ape, char sex, int eda, String tip, double salariob, double ven){
            super(ced,nom,ape,sex,eda,tip);
            this.SalarioBase=salariob;
            this.Ventas=ven;

	}

	public double getSalarioBase(){
		return SalarioBase;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSalarioBase(double newVal){
		SalarioBase = newVal;
	}

	public double getVentas(){
		return Ventas;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVentas(double newVal){
		Ventas = newVal;
	}

        @Override
	public void Imprimir(){
            JOptionPane.showMessageDialog(null, "El sueldo del empleado AsalariadoPorComision es de: $"+CalcularSueldo());

	}

        @Override
	public double CalcularSueldo(){
            double total=0;
            total = SalarioBase+(SalarioBase*(Ventas/100));
		
            return total;
	}

}