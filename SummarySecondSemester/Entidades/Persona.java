package Entidades;

/**
 * @author Joffre Cartuche
 * @version 1.0
 * @created 04-feb.-2021 10:22:41
 */
public class Persona {

	private String Cedula;
	private String Nombres;
	private String Apellidos;
	private int Edad;
	private char Sexo;
	private String EstadoCivil;
	public Persona(){

	}
	public Persona(String ced, String nom, String ape, int eda, char sex, String est){
            this.Cedula = ced;
            this.Nombres=nom;
            this.Apellidos=ape;
            this.Edad = eda;
            this.Sexo=sex;
            this.EstadoCivil=est;
	}
	public String getCedula(){
		return Cedula;
	}
	public void setCedula(String newVal){
		Cedula = newVal;
	}

	public String getNombres(){
		return Nombres;
	}

	public void setNombres(String newVal){
		Nombres = newVal;
	}

	public String getApellidos(){
		return Apellidos;
	}

	public void setApellidos(String newVal){
		Apellidos = newVal;
	}

	public int getEdad(){
		return Edad;
	}
	public void setEdad(int newVal){
		Edad = newVal;
	}

	public char getSexo(){
		return Sexo;
	}

	public void setSexo(char newVal){
		Sexo = newVal;
	}

	public String getEstadoCivil(){
		return EstadoCivil;
	}

	public void setEstadoCivil(String newVal){
		EstadoCivil = newVal;
	}

	public String ImprimirPersona(){
		return "Cedula :" + this.Cedula +"\n" +"Nombres :" + this.Nombres +" "+ this.Apellidos+"\n" +
                        "Edad :" + this.Edad  +"\n" +"Sexo :" + this.Sexo + "\n" +"Estado Civil :" + this.EstadoCivil;
	}

}