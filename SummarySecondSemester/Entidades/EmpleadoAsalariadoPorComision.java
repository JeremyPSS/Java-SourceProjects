package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 06-feb-2021 10:55:11 p.m.
 */
public class EmpleadoAsalariadoPorComision extends Empleado {

	private double salario;
	private double ventas;


	public EmpleadoAsalariadoPorComision(){
            super();
	}

	public EmpleadoAsalariadoPorComision(String edad, String nombre, String telefono, double salario, double ventas){
            super(edad,nombre,telefono);
            this.salario=salario;
            this.ventas=ventas;
	}

	public double Calcular(){
		double porcentaje = (salario*(ventas/100));
                double recompenza = salario*0.1;
                double total=porcentaje+salario + recompenza;
            return total;
	}

	public double getsalario(){
		return salario;
	}

	public double getventas(){
		return ventas;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null, ImprimirInfo() + "\nSueldo: $" + Calcular());
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setsalario(double newVal){
		salario = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setventas(double newVal){
		ventas = newVal;
	}

}