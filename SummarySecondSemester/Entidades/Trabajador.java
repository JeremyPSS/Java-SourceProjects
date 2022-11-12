package Entidades;

import javax.swing.JOptionPane;

/**
 * @author Joffre Cartuche
 * @version 1.0
 * @created 04-feb.-2021 10:52:59
 */
public class Trabajador extends Persona {

	private String Tipo;
	private double SueldoFijo;
	private double Comisiones;
	private double HorasTrabajadas;
	private double CostoHora;

	public Trabajador(){
            super();
	}
	public Trabajador(String ced, String nom, String ape, int eda, char sex, String est, String tip, double sf, double com, double ht, double ch){
            super(ced,nom,ape,eda,sex,est);
            this.Tipo = tip;
            this.SueldoFijo = sf;
            this.Comisiones=com;
            this.HorasTrabajadas = ht;
            this.CostoHora = ch;
	}

	public String getTipo(){
		return Tipo;
	}
	public void setTipo(String newVal){
		Tipo = newVal;
	}

	public double getSueldoFijo(){
		return SueldoFijo;
	}

	public void setSueldoFijo(double newVal){
		SueldoFijo = newVal;
	}

	public double getComisiones(){
		return Comisiones;
	}
	public void setComisiones(double newVal){
		Comisiones = newVal;
	}

	public double getHorasTrabajadas(){
		return HorasTrabajadas;
	}

	public void setHorasTrabajadas(double newVal){
		HorasTrabajadas = newVal;
	}

	public double getCostoHora(){
		return CostoHora;
	}

	public void setCostoHora(double newVal){
		CostoHora = newVal;
	}

	public double CalcularSueldo(){
	  double sueldo=0;
          if(Tipo.equals("Fijo"))
          {
              sueldo = SueldoFijo+Comisiones;
          }
          if(Tipo.equals("Jornalero"))
          {
              sueldo = HorasTrabajadas * CostoHora;
          }
            
            return sueldo;
	}

	public void ImprimirTrabajador(){
            JOptionPane.showMessageDialog(null,super.ImprimirPersona() + "\n" 
                                               + "Tipo :" + this.Tipo  + "\n" +"Sueldo Cobrar :" + CalcularSueldo() );
	}

} 