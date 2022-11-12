package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 15-mar-2021 08:12:43 a.m.
 */
public class Circulo implements Figura {

	private double Radio;



	public Circulo(double rad){
            this.Radio=rad;

	}

	public Circulo(){

	}

	public double Area(){
		double total= Math.PI*(Radio*Radio);
            return total;
	}

	public void Imprimir(){
            JOptionPane.showMessageDialog(null,"El area del circulo es: "  + Area());

	}

	public double getRadio(){
		return Radio;
	}

	
	public void setRadio(double newVal){
		Radio = newVal;
	}
}