package Entidades;

/**
 * @author Jeremy Prieto
 * @version 1.0
 * @created 08-mar-2021 08:13:49 a.m.
 */
public abstract class Empleado {

	private String Cedula;
	private String Nombres;
	private String Apellidos;
	private char Sexo;
	private int Edad;
        private String Tipo; //Obligatorio en el uso de listas de objetos con distintos tipos de objetos
        //Esto sirve para ya no estar creando varias listas de cada tipo de empleado
        //Ahora solo se nesecita una lista de Empleado, donde dependiendo del tipo

	public Empleado(){

	}
        
        
	public Empleado(String ced, String nom, String ape, char sex, int eda,String tip){
            this.Apellidos=ape;
            this.Cedula=ced;
            this.Edad=eda;
            this.Nombres=nom;
            this.Sexo=sex;
            this.Tipo=tip;

	}

        //Metodos Abstractos
	public abstract void Imprimir();

	public abstract double CalcularSueldo();

        
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
        public String getTipo() {
            return Tipo;
        }
        public void setTipo(String Tipo) {
            this.Tipo = Tipo;
        }
        

}