package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 11-mar-2021
 */
public class Asalariado extends Empleado {

	/**
	 * Fijo
	 */
	private double Sueldo;

	public Asalariado(){
            super();
	}

	public Asalariado(String ced, String nom, String ape, char sex, int eda,String tip, double sue){
            super(ced,nom,ape,sex,eda,tip);
            this.Sueldo=sue;

	}
        
        @Override
        public void Imprimir(){
            JOptionPane.showMessageDialog(null, "El sueldo del empleado asalariado es de: $"+CalcularSueldo());

	}

        @Override
	public double CalcularSueldo(){
		return Sueldo;
	}
	public double getSueldo(){
		return Sueldo;
	}
	public void setSueldo(double newVal){
		Sueldo = newVal;
	}
}