package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 06-feb-2021 10:55:23 p.m.
 */
public class EmpleadoPorComision extends Empleado {

	private double sueldo;
	private double VentasBrutas;


	public EmpleadoPorComision(){
            super();
	}


	public EmpleadoPorComision(String edad, String nombre, String telefono, double sueldo, double ventasb){
            super(edad,nombre,telefono);
            this.VentasBrutas=ventasb;
            this.sueldo=sueldo;
	}

	public double Calcular(){
		double tarifa = VentasBrutas/100;
                double total = tarifa+sueldo;
                return total;
	}

	public double getsueldo(){
		return sueldo;
	}

	public double getVentasBrutas(){
		return VentasBrutas;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null, ImprimirInfo() + "\nSueldo: $" + Calcular());
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsueldo(int newVal){
		sueldo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVentasBrutas(double newVal){
		VentasBrutas = newVal;
	}

}