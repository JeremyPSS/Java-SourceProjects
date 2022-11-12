package Entidades;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 06-feb-2021 10:54:53 p.m.
 */
public class Empleado {

	private String Edad;
	private String Nombre;
	private String Telefono;


	public Empleado(){

	}

	public Empleado(String edad, String nombre, String telefono){
            this.Edad=edad;
            this.Nombre=nombre;
            this.Telefono=telefono;
            
	}

	public String getEdad(){
		return Edad;
	}

	public String getNombre(){
		return Nombre;
	}

	public String getTelefono(){
		return Telefono;
	}

	public String ImprimirInfo(){
            return "\nNombre:"  + Nombre + "\nEdad: " + Edad + "\nTelefono: "+Telefono;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setEdad(String newVal){
		Edad = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setNombre(String newVal){
		Nombre = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setTelefono(String newVal){
		Telefono = newVal;
	}

}