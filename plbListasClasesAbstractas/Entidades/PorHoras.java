package Entidades;

import javax.swing.JOptionPane;

/**
 * @author JeremyPrieto
 * @version 1.0
 * @created 08-mar-2021 08:41:42 a.m.
 */
public class PorHoras extends Empleado {

	private double HorasTrabajadas;
	private double SueldoPorHora;


	public PorHoras(){
            super();
	}

	
	public PorHoras(String ced, String nom, String ape, char sex, int eda, String tip, double horast, double sueldoph){
            super(ced,nom,ape,sex,eda,tip);
            this.HorasTrabajadas=horast;
            this.SueldoPorHora=sueldoph;
	}

	public double getHorasTrabajadas(){
		return HorasTrabajadas;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setHorasTrabajadas(double newVal){
		HorasTrabajadas = newVal;
	}

	public double getSueldoPorHora(){
		return SueldoPorHora;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setSueldoPorHora(double newVal){
		SueldoPorHora = newVal;
	}

        @Override
	public void Imprimir(){
            JOptionPane.showMessageDialog(null, "El sueldo del empleado PorHora es de: $"+CalcularSueldo());
	}

        @Override
	public double CalcularSueldo(){
            double total;
            if(HorasTrabajadas>40){
                double adicional= 1.5*SueldoPorHora;
                total = adicional*HorasTrabajadas;
            }else{
             total=SueldoPorHora*HorasTrabajadas;   
            }
            return total;
	}

}