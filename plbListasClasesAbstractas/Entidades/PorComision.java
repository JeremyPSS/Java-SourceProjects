package Entidades;

import javax.swing.JOptionPane;

/**
 * @author JeremyPrieto
 * @version 1.0
 * @created 08-mar-2021 08:41:53 a.m.
 */
public class PorComision extends Empleado {

	private double Tarifa;
	private double VentasBrutas;
        private double sueldo;



	public PorComision(){
            super();
	}

	
	public PorComision(String ced, String nom, String ape, char sex, int eda, String tip, double tar, double ventasb,double sue){
            super(ced,nom,ape,sex,eda,tip);
            this.Tarifa=tar;
            this.VentasBrutas=ventasb;
            this.sueldo=sue;

	}

	public double getTarifa(){
		return Tarifa;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTarifa(double newVal){
		Tarifa = newVal;
	}

	public double getVentasBrutas(){
		return VentasBrutas;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setVentasBrutas(double newVal){
		VentasBrutas = newVal;
	}

        @Override
	public void Imprimir(){
            JOptionPane.showMessageDialog(null, "El sueldo del empleado por comision es de: $"+CalcularSueldo());
	}

        @Override
	public double CalcularSueldo(){
		double tarifa = Tarifa *(VentasBrutas/100);
                double total = tarifa+sueldo;
                return total;
	}

}