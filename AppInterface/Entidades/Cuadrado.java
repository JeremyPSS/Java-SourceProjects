package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 15-mar-2021 08:12:37 a.m.
 */
public class Cuadrado implements Figura {

	private double Lado;


	public Cuadrado(){

	}


	public Cuadrado(double lad){
            this.Lado=lad;

	}

	public double Area(){
            double total = Lado*Lado;
	
            return total;
	}

	public double getLado(){
		return Lado;
	}

	
	public void setLado(double newVal){
		Lado = newVal;
	}

	public void Imprimir(){
             JOptionPane.showMessageDialog(null,"El area del cuadrado es: "  + Area());

	}

}