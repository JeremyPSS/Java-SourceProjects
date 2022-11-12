package Entidades;

import javax.swing.JOptionPane;

/**
 * @author WUSUARIO
 * @version 1.0
 * @created 06-feb-2021 10:55:18 p.m.
 */
public class EmpleadoPorHora extends Empleado {

	private double HorasTrabajadas;
	private double SueldoPorHora;



	
	public EmpleadoPorHora(){
            super();
	}

	
	public EmpleadoPorHora(String edad, String nombre, String telefono, double horast, double sueldoph){
            super(edad,nombre,telefono);
            this.HorasTrabajadas=horast;
            this.SueldoPorHora=sueldoph;
	}

	public double Calcular(){
            double total;
            if(HorasTrabajadas>40){
                double adicional= 1.5*SueldoPorHora;
                total = adicional*HorasTrabajadas;
            }else{
             total=SueldoPorHora*HorasTrabajadas;   
            }
            return total;
	}

	public double getHorasTrabajadas(){
		return HorasTrabajadas;
	}

	public double getSueldoPorHora(){
		return SueldoPorHora;
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
	public void setSueldoPorHora(double newVal){
		SueldoPorHora = newVal;
	}

}