package Entidades;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 13-mar-2021 10:23:59 a.m.
 */
public class Persona {

	protected String Cedula;
	private String Nombre;
	private String Apellido;
	private char Sexo;
	private int Edad;


	public Persona(){

	}

	public Persona(String ced, String nom, String ape, char sex, int eda){
            this.Apellido=ape;
            this.Cedula=ced;
            this.Edad=eda;
            this.Nombre=nom;
            this.Sexo=sex;

	}

	public String getCedula(){
		return Cedula;
	}

	
	public void setCedula(String newVal){
		Cedula = newVal;
	}

	public String getNombre(){
		return Nombre;
	}

	public void setNombre(String newVal){
		Nombre = newVal;
	}

	public String getApellido(){
		return Apellido;
	}

	public void setApellido(String newVal){
		Apellido = newVal;
	}

	public char getSexo(){
		return Sexo;
	}

	public void setSexo(char newVal){
		Sexo = newVal;
	}

	public int getEdad(){
		return Edad;
	}


	public void setEdad(int newVal){
		Edad = newVal;
	}
        
        public String info(){
            return "Cedula: "+Cedula+"\nNombre: " + Nombre+"\nApellido: " + Apellido + "\nSexo: " + Sexo + "\nEdad: " + Edad;
        }

//	public String toString(){
//		return "";
//	}

}