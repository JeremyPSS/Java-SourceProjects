package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 06-feb-2021 10:55:02 p.m.
 */
public class EmpleadoAsalariado extends Empleado {

	private double HorasTrabajadas;
	private double Sueldo;



	public EmpleadoAsalariado(){
            super();
	}

	
	public EmpleadoAsalariado(String edad, String nombre, String telefono, double horast, double sueldo){
            super(edad,nombre,telefono);
            this.HorasTrabajadas=horast;
            this.Sueldo=sueldo;
	}

	public double Calcular(){
            double total=Sueldo;
            return total;
	}

	public double getHorasTrabajadas(){
		return HorasTrabajadas;
	}

	public double getSueldo(){
		return Sueldo;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null, ImprimirInfo() + "\nSueldo: $" + Calcular());
        
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setHorasTrabajadas(double newVal){
		HorasTrabajadas = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSueldo(double newVal){
		Sueldo = newVal;
	}

}